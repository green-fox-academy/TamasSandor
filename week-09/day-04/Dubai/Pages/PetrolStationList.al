page 50102 PetrolStationList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = PetrolStation;
    CardPageId = PetrolStationCard;
    Caption = 'List of Petrol Stations';

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

                field(Budget; Rec.Budget)
                {
                    ApplicationArea = All;
                    AutoFormatExpression = '<precision, 2:2><standard format, 0> €';
                    AutoFormatType = 10;
                }

                field(ContractStart; Rec.ContractStart)
                {
                    ApplicationArea = All;
                }

                field(ContractEnd; Rec.ContractEnd)
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