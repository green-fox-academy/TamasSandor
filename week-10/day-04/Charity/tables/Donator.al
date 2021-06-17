table 50101 Donator
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
                if Name = '' then begin
                    FieldError(Name, 'This field cannot be empty');
                end;
            end;

        }

        field(3; SumWorth; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = sum(Donation.Worth where(DonatorId = field(Id)));
        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        myInt: Integer;

    trigger OnInsert()
    begin
        Validate(Name);
    end;

    trigger OnModify()
    begin
        Validate(Name);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}