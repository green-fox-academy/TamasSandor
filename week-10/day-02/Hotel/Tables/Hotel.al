table 50100 Hotel
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; Name; Text[100])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if StrLen(Name) = 0 then begin
                    FieldError(Name, 'You must provide a name.');
                end;
            end;
        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    trigger OnInsert()
    begin
        Validate(Name);
    end;

    trigger OnModify()
    begin
        Validate(Name);
    end;
}