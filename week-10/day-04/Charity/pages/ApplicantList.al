page 50100 ApplicantList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Applicant;
    Editable = false;
    CardPageId = ApplicantCard;

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
        area(Factboxes)
        {

        }
    }

    actions
    {
        area(Processing)
        {
            action(ActionName)
            {
                ApplicationArea = All;

                trigger OnAction();
                begin

                end;
            }
        }
    }
}