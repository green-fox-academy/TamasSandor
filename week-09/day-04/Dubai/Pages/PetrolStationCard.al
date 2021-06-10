page 50103 PetrolStationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = PetrolStation;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Name; Rec.Name)
                {
                    ApplicationArea = All;
                }
            }

            group("Contract Dates")
            {
                field(ContractStart; Rec.ContractStart)
                {
                    ApplicationArea = All;
                }

                field(ContractEnd; Rec.ContractEnd)
                {
                    ApplicationArea = All;
                }
            }

            group(Money)
            {
                field(Budget; Rec.Budget)
                {
                    ApplicationArea = All;
                    AutoFormatExpression = '<precision, 2:2><standard format, 0> €';
                    AutoFormatType = 10;
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