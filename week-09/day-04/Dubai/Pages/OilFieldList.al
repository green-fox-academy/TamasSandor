page 50100 OilFieldList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilField;
    Caption = 'List of Oil Fields';
    CardPageId = OilFieldCard;

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

                field(OilAmount; Rec.OilAmount)
                {
                    ApplicationArea = All;
                }

                field(Yield; Rec.Yield)
                {
                    ApplicationArea = All;
                }

                field(MonthlyExpense; Rec.MonthlyExpense)
                {
                    ApplicationArea = All;
                    AutoFormatExpression = '<precision, 2:2><standard format, 0> €';
                    AutoFormatType = 10;
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