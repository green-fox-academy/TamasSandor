page 50101 DirectorCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Director;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Name; Rec.Name)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;
                }

                field(Birth; Rec.Birth)
                {
                    ApplicationArea = All;
                }
            }
        }
    }
}