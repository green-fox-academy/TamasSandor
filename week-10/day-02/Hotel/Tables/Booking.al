table 50102 Booking
{
    DataClassification = ToBeClassified;


    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; Days; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Days < 0 then begin
                    FieldError(Days, 'Days can not be negative.');
                end;
            end;
        }

        field(3; HotelRoomId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = HotelRoom.Id;
            trigger OnValidate()
            begin
                if HotelRoomId = 0 then begin
                    FieldError(HotelRoomId, 'Hotel room Id can not be empty.');
                end;
            end;
        }

        field(4; HotelRoomName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(HotelRoom.Name where(Id = field(HotelRoomId)));
        }

        field(5; HotelRoomPrice; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = lookup(HotelRoom.PriceForNight where(Id = field(HotelRoomId)));
        }

        field(7; HotelName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(HotelRoom.HotelName where(Id = field(HotelRoomId)));
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
        Validate(Days);
        Validate(HotelRoomId);
    end;

    trigger OnModify()
    begin
        Validate(Days);
        Validate(HotelRoomId)
    end;
}