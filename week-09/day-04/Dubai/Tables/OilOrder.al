table 50102 OilOrder
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; PetrolStationId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = PetrolStation.Id;
        }

        field(3; Amount; Integer) // Amount of barrels that has been ordered
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                OrderPrice := BarrelPrice.GetPrice() * Amount;
            end;
        }

        field(4; OrderPrice; Decimal) // The price of the barrels
        {
            DataClassification = ToBeClassified;
            Editable = false;
            trigger OnValidate()
            begin
                CalcFields(PetrolStationBudget);
                if OrderPrice > PetrolStationBudget then begin
                    FieldError(OrderPrice, 'You will be bankrupted.');
                end;
            end;
        }

        field(5; OrderDate; Date)
        {
            DataClassification = ToBeClassified;
        }

        field(6; Accepted; Boolean) // An indicator for the acceptance of the order
        {
            DataClassification = ToBeClassified;
        }

        // You need to check if the order is legit: the petrol station has the money for the order.
        field(7; PetrolStationBudget; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(PetrolStation.Budget where(Id = field(PetrolStationId)));
        }

        field(8; PetrolStationName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(PetrolStation.Name where(Id = field(PetrolStationId)));
        }

        field(9; OilFieldId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = OilField.Id;
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
        BarrelPrice: Codeunit BarrelPrice;

    trigger OnInsert()
    begin
        Validate(Amount);
        Validate(OrderPrice);
        OnlyOnceInAMonth();
    end;

    trigger OnModify()
    begin
        Validate(Amount);
        Validate(OrderPrice);
        OnlyOnceInAMonth();
    end;

    // A petrol station can take an order ONLY once in a month
    local procedure OnlyOnceInAMonth()
    var
        OilOrderRecord: Record OilOrder;
    begin
        if OilOrderRecord.Get(PetrolStationId) then begin
            if (Date2DMY(OilOrderRecord.OrderDate, 2) = Date2DMY(OrderDate, 2)) then begin
                //Error('There is already an order for this month.');
            end;
        end;
    end;
}