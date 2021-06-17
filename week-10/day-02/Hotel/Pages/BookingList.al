page 50100 BookingList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Booking;
    CardPageId = BookingCard;
    Editable = false;

    layout
    {
        area(Content)
        {
            repeater(General)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;
                }

                field(Days; Rec.Days)
                {
                    ApplicationArea = All;
                }

                field("Room Id"; Rec.HotelRoomId)
                {
                    ApplicationArea = All;
                }

                field("Room Name"; Rec.HotelRoomName)
                {
                    ApplicationArea = All;
                }
            }
        }
    }

    actions
    {
        area(Processing)
        {
            action(MostExpensiveHotelRoom)
            {
                ApplicationArea = All;
                Caption = 'Most Expensive Hotel Room';

                trigger OnAction()
                var
                    MostExpensiveHotelRoomQuery: Query MostExpensiveHotelRoomQuery;
                begin
                    if MostExpensiveHotelRoomQuery.Open() then begin
                        if MostExpensiveHotelRoomQuery.Read() then begin
                            Message('Id: %1 Price: %2', MostExpensiveHotelRoomQuery.Id);
                        end;
                    end;
                end;
            }
        }
    }
}