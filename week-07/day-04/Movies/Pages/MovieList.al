page 50102 MovieList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Movie;
    Caption = 'List of Movies';
    CardPageId = MovieCard;

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
                field(Title; Rec.Title)
                {
                    ApplicationArea = All;
                }
                field(Year; Rec.Year)
                {
                    ApplicationArea = All;
                }
                field(LengthInMinutes; Rec.LengthInMinutes)
                {
                    ApplicationArea = All;
                    Caption = 'Length in minutes';
                }
                field(DirectorName; Rec.DirectorName)
                {
                    ApplicationArea = All;
                    Caption = 'Director';
                }
            }
        }
    }
}