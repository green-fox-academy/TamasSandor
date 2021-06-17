query 50100 MostExpensiveHotelRoomQuery
{
    QueryType = Normal;
    TopNumberOfRows = 1;
    OrderBy = descending(PriceForNight);

    elements
    {
        dataitem(HotelRoom; HotelRoom)
        {
            column(Id; Id) { }

            column(PriceForNight; PriceForNight) { }
        }
    }
}