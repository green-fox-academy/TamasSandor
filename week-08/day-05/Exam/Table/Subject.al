table 50100 Subject
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
                If StrLen(Rec.Name) < 2 then begin
                    Error('The Name minimum 5 caracter');
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

    fieldgroups
    {
        fieldgroup(DropDown; Id, Name) { }
    }

    trigger OnInsert()
    begin
        Validate(Rec.Name);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Name);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}