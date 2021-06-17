codeunit 50101 ApplicantEventSubscriber
{
    trigger OnRun()
    begin

    end;

    [EventSubscriber(ObjectType::Table, Database::Applicant, 'OnAfterInsertEvent', '', true, true)]

    local procedure ApplicantStatus(var Rec: Record Applicant)
    var
        PositionQuery: Codeunit OpenPositionQuery;
        Result: Integer;
    begin
        //PositionQuery.Getposition(Rec);
        Result := PositionQuery.Getposition(Rec);
        Message('%1 is an applicant, their income is %2, their family size is %3, position is %4 in need list', Rec.Name, Rec.MonthlyIncome, Rec.FamilySize, Result);
    end;

    var

}