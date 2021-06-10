page 50101 OilFieldCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilField;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(OilAmount; Rec.OilAmount)
                {
                    ApplicationArea = All;
                    Caption = 'Oil Amount';
                }

                field(Yield; Rec.Yield) // weekly income of oil
                {
                    ApplicationArea = All;
                    ToolTip = 'Weekly income of oil';
                    ShowMandatory = true;
                }

                field(MonthlyExpense; Rec.MonthlyExpense)
                {
                    ApplicationArea = All;
                    Caption = 'Monthly Expense';
                    ToolTip = 'Monthly expense that needs to be paid in euros';
                    AutoFormatExpression = '<precision, 2:2><standard format, 0> €';
                    AutoFormatType = 10;
                    ShowMandatory = true;
                }

                field(Location; Rec.Location)
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
}