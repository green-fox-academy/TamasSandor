page 50106 OilForAllRoleCenter
{
    PageType = RoleCenter;

    layout
    {
        area(RoleCenter)
        {
            group(General)
            {
                part(HeadLinePart; OilForAllHeadline)
                {
                    ApplicationArea = All;
                }

                part(PetrolStations; PetrolStationCueGroupPart)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

    actions
    {
        // area(Sections) // Kinyitható/összecsukható 'menü' linkekkel

        area(Reporting)
        {
            action(MonthlyFinancialReport)
            {
                ApplicationArea = All;
                Caption = 'Financial Report';
                RunObject = Report MonthlyFinancialReport;
            }
        }
        area(Embedding) // Linkek az oldal tetején
        {
            action(OilFieldList)
            {
                ApplicationArea = All;
                Caption = 'List of Oil Fields';
                RunObject = Page OilFieldList;
            }

            action(PetrolSattionList)
            {
                ApplicationArea = All;
                Caption = 'List of Petrol Stations';
                RunObject = Page PetrolStationList;
            }

            action(OilOrderList)
            {
                ApplicationArea = All;
                Caption = 'List of Oil Orders';
                RunObject = Page OilOrderList;
            }
        }

        area(Creation)
        {
            action(CreateOilField)
            {
                ApplicationArea = All;
                Caption = 'Add a new Oil Field';
                RunObject = Page OilFieldCard;
            }

            action(CreatePetrolStation)
            {
                ApplicationArea = All;
                Caption = 'Add Petrol Station';
                RunObject = Page PetrolStationCard;
            }
        }
    }
}

profile OilForAllProfile
{
    Caption = 'Oil for All Profile';
    RoleCenter = OilForAllRoleCenter;
}