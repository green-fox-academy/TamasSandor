query 50102 MostDonationQuery
{
    QueryType = Normal;
    OrderBy = descending(DonatorId);
    TopNumberOfRows = 1;

    elements
    {
        dataitem(Donation; Donation)
        {
            column(DonatorId)
            {
                Method = Count;
            }

            column(DonatorName; DonatorName) { }
        }
    }
}