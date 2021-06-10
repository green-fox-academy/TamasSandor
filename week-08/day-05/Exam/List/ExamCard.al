page 50105 ExamCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Exam;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
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

                field(Subject; Rec.SubjectId)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

}