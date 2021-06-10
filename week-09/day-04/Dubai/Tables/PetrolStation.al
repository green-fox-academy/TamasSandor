table 50101 PetrolStation
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
                    FieldError(Name, 'Name must be provided.');
                end;
            end;
        }

        field(3; Budget; Decimal) // money in euros
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            // Calculate the number of months between two dates:
            // Date2DMY(ContractEnd, 2) - Date2DMY(ContractStart, 2)
            begin
                if Budget < ((ContractEnd - ContractStart) * 1500) then begin
                    FieldError(Budget, 'You can not be a poor fuck.');
                end;
            end;
        }

        field(4; ContractStart; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if ContractStart < Today then begin
                    FieldError(ContractStart, 'Start date can not be in the past.');
                end;
            end;
        }

        field(5; ContractEnd; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if (ContractEnd - ContractStart < 6) then begin
                    FieldError(ContractEnd, 'End date must be later than the Start date.');
                end;
            end;
        }

        field(6; NumberOfPetrolStations; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = Count(PetrolStation);
        }

        field(7; SumBudget; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = Sum(PetrolStation.Budget);
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
        Validate(Name);
        Validate(Budget);
        Validate(ContractStart);
        Validate(ContractEnd);
    end;

    trigger OnModify()
    begin
        Validate(Name);
        Validate(Budget);
        Validate(ContractStart);
        Validate(ContractEnd);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}