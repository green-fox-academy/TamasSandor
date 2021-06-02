page 50104 BoxOfficeList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = BoxOffice;
    Caption = 'List of Box Office';
    CardPageId = BoxOfficeCard;

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
                field(Rating; Rec.Rating)
                {
                    ApplicationArea = All;
                }
                field(DomesticSales; Rec.DomesticSales)
                {
                    ApplicationArea = All;
                }
                field(InternationalSales; Rec.InternationalSales)
                {
                    ApplicationArea = All;
                }
                field(Movie; Rec.MovieTitle)
                {
                    ApplicationArea = All;
                }

            }
        }
    }
}