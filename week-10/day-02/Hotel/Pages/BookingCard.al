page 50101 BookingCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Booking;
    AutoSplitKey = true;
    DelayedInsert = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Days; Rec.Days)
                {
                    ApplicationArea = All;
                }

                field(HotelRoomId; Rec.HotelRoomId)
                {
                    ApplicationArea = All;
                    Caption = 'Hotel Room';
                }
            }
        }
    }
}