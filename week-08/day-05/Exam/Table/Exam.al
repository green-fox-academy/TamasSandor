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
                    FieldError(Rec.Name, 'The Name minimum 5 caracter');
                end;
            end;
        }

        field(3; DueDate; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if Rec.DueDate < Date2DMY(CalcDate('CD'), 3) then begin
                    FieldError(Rec.DueDate, 'Exam can not be in the past.');
                end;
            end;
        }

        field(4; MaxScore; Integer)
        {
            DataClassification = ToBeClassified;
            trigger OnValidate()
            begin
                if (Rec.MaxScore > 100) or (Rec.MaxScore < 0) then begin
                    FieldError(Rec.MaxScore, 'Exam score have to be between 0 and 100.');
                end;
            end;
        }

        field(5; SubjectId; Integer)
        {
            DataClassification = ToBeClassified;
            TableRelation = Subject.Id;
        }

        field(6; SubjectName; Text[100])
        {
            FieldClass = FlowField;
            CalcFormula = lookup(Subject.Name where(Id = field(SubjectId)));
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