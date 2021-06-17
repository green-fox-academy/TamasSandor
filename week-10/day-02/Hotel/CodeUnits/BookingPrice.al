codeunit 50101 BookingPrice
{
    [EventSubscriber(ObjectType::Table, DataBase::Booking, 'OnAfterInsertEvent', '', true, true)]
    local procedure BookingPrice(var Rec: Record Booking)
    begin
        Rec.CalcFields(HotelRoomPrice);
        Message('The price of your booking is: %1 !', Rec.HotelRoomPrice * Rec.Days);
    end;
}