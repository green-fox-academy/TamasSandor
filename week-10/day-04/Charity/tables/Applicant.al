table 50103 Applicant
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
        field(3; MonthlyIncome; Decimal)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if MonthlyIncome <= 0 then begin
                    FieldError(MonthlyIncome, 'This field has to be over 0');
                end;
            end;

        }
        field(4; FamilySize; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if FamilySize <= 0 then begin
                    FieldError(FamilySize, 'This field has to be over 0');
                end;
            end;

        }
        field(5; CategoryId; Integer)
        {
            TableRelation = Category;
            trigger OnValidate()
            begin
                if FamilySize <= 0 then begin
                    FieldError(FamilySize, 'This field has to be over 0');
                end;
            end;
        }
        field(6; MoneyPerMember; Decimal)
        {
            DataClassification = ToBeClassified;

        }
        field(7; SumApplicant; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Applicant);

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
        MoneyPerMember := MonthlyIncome / FamilySize;
    end;

    trigger OnModify()
    begin
        Validate(Name);
        MoneyPerMember := MonthlyIncome / FamilySize;
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}