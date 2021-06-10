codeunit 50100 BarrelPrice
{
    SingleInstance = true;

    procedure GetPrice() ReturnValue: Integer
    begin
        ReturnValue := Barrelprice;
    end;

    procedure SetPrice(NewPrice: Integer)
    begin
        Barrelprice := NewPrice;
    end;

    [EventSubscriber(ObjectType::Codeunit, Codeunit::"System Initialization", 'OnAfterInitialization', '', false, false)]
    internal procedure OnAfterInitialization()
    begin
        BarrelPrice := 10;
    end;

    var
        BarrelPrice: Integer;
}