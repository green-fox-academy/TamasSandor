table 50102 Exam
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
                    Error('The Name minimum 5 caracter');
                end;
            end;
        }

        field(3; DueDate; Date)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.DueDate < CalcDate('CD') then begin
                    Error('Exam can not be in the past.');
                end;
            end;
        }

        field(4; MaxScore; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if (Rec.MaxScore > 100) or (Rec.MaxScore < 0) then begin
                    Error('Exam score have to be between 0 and 100.');
                end;
            end;
        }

        field(5; SubjectId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Subject.Id;
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
        Validate(Rec.DueDate);
        Validate(Rec.MaxScore);
    end;

    trigger OnModify()
    begin
        Validate(Rec.Name);
        Validate(Rec.DueDate);
        Validate(Rec.MaxScore);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;
}