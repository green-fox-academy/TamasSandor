page 50108 PetrolStationCueGroupPart
{
    PageType = CardPart;
    SourceTable = PetrolStation;
    Caption = 'Petrol Stations';

    layout
    {
        area(Content)
        {
            cuegroup(PetrolStationStats)
            {
                ShowCaption = false;
                field(NumberOfPetrolStation; Rec.NumberOfPetrolStations)
                {
                    ApplicationArea = All;
                    Caption = 'Number of Petrol Stations';
                    DrillDownPageId = PetrolStationList;
                }

                field(SumBudget; Rec.SumBudget)
                {
                    ApplicationArea = All;
                    Caption = 'Budget of all Petrol Stations';
                    DrillDownPageId = PetrolStationList;
                    AutoFormatExpression = '<precision, 2:0><standard format, 0> €';
                    AutoFormatType = 10;
                }
            }
        }
    }
}