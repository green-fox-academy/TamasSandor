table 50101 HotelRoom
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
            Caption = 'Room';
            trigger OnValidate()
            begin
                if StrLen(Name) = 0 then begin
                    FieldError(Name, 'You must provide a name.');
                end;
            end;
        }

        field(3; PriceForNight; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if PriceForNight < 0 then begin
                    FieldError(PriceForNight, 'Price can not be negative.');
                end;
            end;
        }

        field(4; HotelId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Hotel.Id;
        }

        field(5; HotelName; Text[100])
        {
            FieldClass = FlowField;
            Caption = 'Hotel';
            CalcFormula = lookup(Hotel.Name where(Id = field(HotelId)));
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
        fieldgroup(DropDown; Id, HotelName, Name) { }
    }

    trigger OnInsert()
    begin
        Validate(Name);
        Validate(PriceForNight);
    end;

    trigger OnModify()
    begin
        Validate(Name);
        Validate(PriceForNight);
    end;
}