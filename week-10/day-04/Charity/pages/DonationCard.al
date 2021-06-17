page 50108 DonationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Donation;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(GroupName)
            {
                field(DonatorId; Rec.DonatorId)
                {
                    ApplicationArea = All;

                }
                field(CategoryId; Rec.CategoryId)
                {
                    ApplicationArea = All;

                }
                field(Worth; Rec.Worth)
                {
                    ApplicationArea = All;

                }
                field(IsDonated; Rec.IsDonated)
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