query 50100 PositionQuery
{
    QueryType = Normal;
    OrderBy = ascending(MoneyPerMember);


    elements
    {
        dataitem(Applicant; Applicant)
        {
            column(MoneyPerMember; MoneyPerMember)
            {
            }
        }
    }

    var
        myInt: Integer;

    trigger OnBeforeOpen()
    begin

    end;
}