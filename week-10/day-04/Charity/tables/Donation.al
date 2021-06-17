table 50102 Donation
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; DonatorId; Integer)
        {
            TableRelation = Donator;
            trigger OnValidate()
            begin
                if DonatorId <= 0 then begin
                    FieldError(DonatorId, 'This field has to be a positive number');
                end
            end;

        }
        field(3; CategoryId; Integer)
        {
            TableRelation = Category;

            trigger OnValidate()
            begin
                if CategoryId <= 0 then begin
                    FieldError(CategoryId, 'This field has to be a positive number');
                end
            end;

        }
        field(4; Worth; Decimal)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Worth <= 0 then begin
                    FieldError(Worth, 'This field has to be over 0');
                end
            end;

        }
        field(5; IsDonated; Boolean)
        {
            DataClassification = ToBeClassified;

        }
        field(6; DonatorName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Donator.Name where(Id = field(DonatorId)));

        }
        field(7; CategoryName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Category.Name where(Id = field(CategoryId)));

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
        fieldgroup(DropDown; Id, DonatorName, Worth, CategoryName)
        {

        }
    }
    trigger OnInsert()
    begin
        Validate(DonatorId);
        Validate(CategoryId);
        Validate(Worth);
    end;

    trigger OnModify()
    begin
        Validate(DonatorId);
        Validate(CategoryId);
        Validate(Worth);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}