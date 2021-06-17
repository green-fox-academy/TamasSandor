codeunit 50100 DataSeed
{
    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        HotelRecord: Record Hotel;
        HotelRoomRecord: Record HotelRoom;
    begin
        if HotelRecord.IsEmpty then begin
            InsertHotel(1, 'Four Seasons');
            InsertHotel(2, 'Le Méridien');
            InsertHotel(3, 'Ritz-Carlton');
        end;

        if HotelRoomRecord.IsEmpty then begin
            InsertHotelRoom(1, 'Danube River-View Room', 50000, 1);
            InsertHotelRoom(2, 'Royal Suite', 100000, 1);
            InsertHotelRoom(3, 'Buda Castle Presidential Suite', 500000, 1);

            InsertHotelRoom(4, 'Deluxe', 40000, 2);
            InsertHotelRoom(5, 'Executive City', 80000, 2);
            InsertHotelRoom(6, 'Duplex Loft Suite', 110000, 2);

            InsertHotelRoom(7, 'Carlton Suite', 600000, 3);
            InsertHotelRoom(8, 'Palace Suite', 800000, 3);
            InsertHotelRoom(9, 'The Ritz-Carlton Suite', 2000000, 3);
        end;
    end;

    local procedure InsertHotel(Id: Integer; Name: Text[100])
    var
        HotelRecord: Record Hotel;
    begin
        HotelRecord.Id := Id;
        HotelRecord.Name := Name;
        HotelRecord.Insert();
    end;

    local procedure InsertHotelRoom(Id: Integer; Name: Text[100]; Price: Integer; HotelId: Integer)
    var
        HotelRoomRecord: Record HotelRoom;
    begin
        HotelRoomRecord.Id := Id;
        HotelRoomRecord.Name := Name;
        HotelRoomRecord.PriceForNight := Price;
        HotelRoomRecord.HotelId := HotelId;
        HotelRoomRecord.Insert();
    end;
}