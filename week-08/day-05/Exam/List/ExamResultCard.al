page 50107 ExamResultCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = ExamResult;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(StudentId; Rec.StudentId)
                {
                    ApplicationArea = All;
                }

                field(ExamId; Rec.ExamId)
                {
                    ApplicationArea = All;
                }

                field(StudentScore; Rec.StudentScore)
                {
                    ApplicationArea = All;
                }

                field(Attended; Rec.Attended)
                {
                    ApplicationArea = All;
                }

            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction()
                begin

                end;
            }
        }
    }

    var
        myInt: Integer;
}