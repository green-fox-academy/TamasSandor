query 50101 HighestDonationQuery
{
    QueryType = Normal;
    TopNumberOfRows = 1;
    OrderBy = descending(Worth);

    elements
    {
        dataitem(Donation; Donation)
        {
            column(Id; Id)
            {

            }
            column(Worth; Worth)
            {

            }
        }
    }
}