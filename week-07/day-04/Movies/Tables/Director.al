table 50100 Director
{
    DataClassification = ToBeClassified;
    DataCaptionFields = Id, Name;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;
        }

        field(2; Name; Text[50])
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if StrLen(Rec.Name) = 0 then begin
                    Error('The Name must have a value.');
                end
                else
                    if StrLen(Rec.Name) < 3 then begin
                        Error('The Name can not be less than 3 characters long.');
                    end;
            end;
        }

        field(3; Birth; Date)
        {
            DataClassification = ToBeClassified;
        }

        field(4; DomesticSalesIncome; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = sum(BoxOffice.DomesticSales where(DirectorId = field(Id)));
        }

        field(5; AverageRating; Decimal)
        {
            FieldClass = FlowField;
            CalcFormula = average(BoxOffice.Rating where(DirectorId = field(Id)));
        }

        field(6; TotalMovies; Integer)
        {
            FieldClass = FlowField;
            CalcFormula = count(Movie where(DirectorId = field(Id)));
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
        fieldgroup(DropDown; Id, Name)
        {
        }
    }

    trigger OnInsert()
    begin
        Validate(Rec.Name);
        Rec.Name := UpperCase(Rec.Name);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Name);
        Rec.Name := UpperCase(Rec.Name);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}