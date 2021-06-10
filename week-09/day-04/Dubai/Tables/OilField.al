table 50100 OilField
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; OilAmount; Integer) // sum of barrels that can be obtained from the Oil Field
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if OilAmount < 10000 then begin
                    FieldError(OilAmount, 'Can not be less than 10 000');
                end;
            end;
        }

        field(3; Yield; Integer) // weekly income of oil in barrels
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Yield = 0 then begin
                    FieldError(Yield, 'Weekly oil production can not be zero.');
                end;
            end;
        }

        field(4; MonthlyExpense; Decimal) // in euros
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if MonthlyExpense = 0 then begin
                    FieldError(MonthlyExpense, 'Monthly expense can not be zero.');
                end;
            end;
        }

        field(5; Location; Text[100]) // coordinates
        {
            DataClassification = ToBeClassified;
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
        Validate(OilAmount);
        Validate(Yield);
        Validate(MonthlyExpense);
        CheckLoss();
    end;

    trigger OnModify()
    begin
        Validate(OilAmount);
        Validate(Yield);
        Validate(MonthlyExpense);
        CheckLoss();
    end;

    local procedure CheckLoss()
    var
        BarrelPrice: Codeunit BarrelPrice;
    begin
        if MonthlyExpense > (BarrelPrice.GetPrice() * Yield * 4) then begin
            Error('Jockey Ewing would not be proud.');
        end;
    end;

}