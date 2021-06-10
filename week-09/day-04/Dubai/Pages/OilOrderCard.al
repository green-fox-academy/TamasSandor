page 50105 OilOrderCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilOrder;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(PetrolStationId; Rec.PetrolStationId)
                {
                    ApplicationArea = All;
                    Caption = 'Petrol Station';
                }

                field(Amount; Rec.Amount)
                {
                    ApplicationArea = All;
                }

                field(OrderPrice; Rec.OrderPrice)
                {
                    ApplicationArea = All;
                    AutoFormatExpression = '<precision, 2:2><standard format, 0> €';
                    AutoFormatType = 10;
                }

                field(OrderDate; Rec.OrderDate)
                {
                    ApplicationArea = All;
                }

                field(OilFieldId; Rec.OilFieldId)
                {
                    ApplicationArea = All;
                }

                group("Accept Order")
                {
                    field(Accepted; Rec.Accepted)
                    {
                        ApplicationArea = All;
                    }
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