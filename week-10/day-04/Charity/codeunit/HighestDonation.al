codeunit 50103 HighestDonation
{
    [EventSubscriber(ObjectType::Table, Database::Donation, 'OnAfterInsertEvent', '', true, true)]
    local procedure HighestDonation(var Rec: Record Donation)
    var
        HighestDontaionQuery: Query HighestDonationQuery;
    begin
        if HighestDontaionQuery.Open() then begin
            if HighestDontaionQuery.Read() then begin
                Message('The highest worth donation %1 with the worth of %2', HighestDontaionQuery.Id, HighestDontaionQuery.Worth);
            end;
        end;
    end;
}