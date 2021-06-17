page 50101 ApplicantCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Applicant;
    AutoSplitKey = true;
    DelayedInsert = true;

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
                field(MonthlyIncome; Rec.MonthlyIncome)
                {
                    ApplicationArea = All;

                }
                field(FamilySize; Rec.FamilySize)
                {
                    ApplicationArea = All;

                }
                field(CategoryId; Rec.CategoryId)
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