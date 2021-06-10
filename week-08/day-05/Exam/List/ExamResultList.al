page 50106 ExamResultList
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = ExamResult;
    CardPageId = ExamResultCard;

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

                field(StudentId; Rec.StudentId)
                {
                    ApplicationArea = All;
                }

                field(StudentName; Rec.StudentName)
                {
                    ApplicationArea = All;
                }

                field(StudentScore; Rec.StudentScore)
                {
                    ApplicationArea = All;
                }

                field(ExamId; Rec.ExamId)
                {
                    ApplicationArea = All;
                }

                field(MaxExamScore; Rec.MaxExamScore)
                {
                    ApplicationArea = All;
                }

                field(ExamDate; Rec.ExamDate)
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
        area(Reporting)
        {
            action(TodoReport)
            {
                ApplicationArea = All;
                Caption = 'Todo Report';
                Promoted = true;
                PromotedCategory = Report;
                RunObject = report FailedStudentReport;
            }
        }
    }

}