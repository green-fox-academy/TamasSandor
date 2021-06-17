query 50101 MostFreQuentlyBookedHotelRoom
{
    QueryType = Normal;
    TopNumberOfRows = 1;
    OrderBy = descending(HotelRoomId);

    elements
    {
        dataitem(BookingTable; Booking)
        {
            column(HotelRoomId)
            {
                Method = Count;
            }

            dataitem(HotelRoom; HotelRoom)
            {
                DataItemLink = Id = BookingTable.HotelRoomId;
                SqlJoinType = InnerJoin;

                column(Name; Name) { }
            }
        }
    }
}