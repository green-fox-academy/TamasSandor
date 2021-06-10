page 50104 ExamList
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Exam;
    CardPageId = ExamCard;
    Caption = 'List of Exams';

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                }

                field(Name; Rec.Name)
                {
                    ApplicationArea = All;
                }

                field(DueDate; Rec.DueDate)
                {
                    ApplicationArea = All;
                }

                field(MaxScore; Rec.MaxScore)
                {
                    ApplicationArea = All;
                }

                field(SubjectId; Rec.SubjectId)
                {
                    ApplicationArea = All;
                }

            }
        }
    }

}