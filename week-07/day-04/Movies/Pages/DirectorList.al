page 50100 DirectorList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Director;
    Caption = 'List of Directors';
    CardPageId = DirectorCard;

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

                field(Birth; Rec.Birth)
                {
                    ApplicationArea = All;
                }

                field(DomesticSalesIncome; Rec.DomesticSalesIncome)
                {
                    ApplicationArea = All;
                }

                field(AverageRating; Rec.AverageRating)
                {
                    ApplicationArea = All;
                }

                field(TotalMovies; Rec.TotalMovies)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}