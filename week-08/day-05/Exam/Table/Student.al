table 50101 Student
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
                If StrLen(Rec.Name) < 5 then begin
                    FieldError(Rec.Name, 'The Name minimum 5 caracter');
                end;
            end;
        }

        field(3; Email; Text[150])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if not Rec.Email.Contains('@') then begin
                    FieldError(Rec.Email, 'Email must contain a @');
                end;
            end;
        }

        field(4; Gender; enum GenderEnum)
        {
            DataClassification = ToBeClassified;
        }

        field(5; Birth; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.Birth < CalcDate('CY-65Y') then begin
                    FieldError(Rec.Birth, 'You are an old fuck.');
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
        Validate(Rec.Email);
        Validate(Rec.Birth);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Name);
        Validate(Rec.Email);
        Validate(Rec.Birth);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}