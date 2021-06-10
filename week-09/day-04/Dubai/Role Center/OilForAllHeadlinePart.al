page 50107 OilForAllHeadline
{
    PageType = HeadlinePart;

    layout
    {
        area(Content)
        {
            group(HeadLinePart)
            {
                field(FirstHeadline; FirstHeadline)
                {
                    ApplicationArea = All;
                }

                field(SecondHeadline; SecondHeadline)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

    var
        FirstHeadline: Label 'This is my first headline';
        SecondHeadline: Label 'This is my second headline';
}