report 50100 MonthlyFinancialReport
{
    UsageCategory = Administration;
    ApplicationArea = All;
    DefaultLayout = RDLC;
    RDLCLayout = 'MonthlyFinancialReport.rdl';
    UseRequestPage = true;

    /*
        It should contain all the orders that was made in the actual month
            The orders can be filtered by acceptance
        It should have some additional fields (you can do this in another list):
            The sum of oil barrels gained from the oil fields
            The sum of the expenses of the oil fields
        The list of oil fields with the reamining barrels that can be obtained
            The amount of time before the oil field becomes empty
    */

    dataset
    {
        dataitem(OilOrder; OilOrder)
        {
            column(Amount; Amount) { }

            column(OrderDate; OrderDate) { }

            dataitem(OilField; OilField)
            {
                DataItemLinkReference = OilOrder;
                DataItemLink = Id = field(OilFieldId);
            }
        }
    }

    requestpage
    {
        layout
        {
            area(Content)
            {
                group(Accepted)
                {
                    field(Acceptance; OilOrder.Accepted)
                    {
                        ApplicationArea = All;
                    }
                }

                group("Order Date")
                {
                    field("Date"; OilOrder.OrderDate)
                    {
                        ApplicationArea = All;
                    }
                }
            }
        }

        actions
        {
            area(processing)
            {
                action(ActionName)
                {
                    ApplicationArea = All;

                }
            }
        }
    }
}