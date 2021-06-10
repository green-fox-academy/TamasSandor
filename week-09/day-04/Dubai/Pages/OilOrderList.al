page 50104 OilOrderList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = OilOrder;
    CardPageId = OilOrderCard;
    Caption = 'List of Oil Orders';

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                    Editable = false;
                }

                field(PetrolStationId; Rec.PetrolStationId)
                {
                    ApplicationArea = All;
                    Editable = false;
                }

                field(PetrolStationName; Rec.PetrolStationName)
                {
                    ApplicationArea = All;
                    Editable = false;
                }

                field(Amount; Rec.Amount)
                {
                    ApplicationArea = All;
                    Editable = false;
                }

                field(OrderPrice; Rec.OrderPrice)
                {
                    ApplicationArea = All;
                    AutoFormatExpression = '<precision, 2:2><standard format, 0> €';
                    AutoFormatType = 10;
                    Editable = false;
                }

                field(OrderDate; Rec.OrderDate)
                {
                    ApplicationArea = All;
                    Editable = false;
                }

                field(Accepted; Rec.Accepted)
                {
                    ApplicationArea = All;
                    Editable = true;
                    trigger OnValidate()
                    begin
                        // The order has to payed for only when it was accepted
                    end;
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