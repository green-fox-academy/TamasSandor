table 50101 Movie
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; Title; Text[50])
        {
            DataClassification = ToBeClassified;
        }

        field(3; Year; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if (Rec.Year <= 1900) Or (Rec.Year > Date2DMY(CalcDate('CY'), 3)) then begin
                    Error('Year is incorrect');
                end;
            end;
        }

        field(4; LengthInMinutes; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.LengthInMinutes < 60 then begin
                    Error('Movie length is incorrect.');
                end;
            end;
        }

        field(5; DirectorId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Director.Id;
        }

        field(6; DirectorName; Text[50])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Director.Name where(Id = field(DirectorId)));
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
        fieldgroup(DropDown; Id, Title)
        {
        }
    }

    trigger OnInsert()
    begin
        Validate(Rec.Year);
        Validate(Rec.LengthInMinutes);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Year);
        Validate(Rec.LengthInMinutes);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}