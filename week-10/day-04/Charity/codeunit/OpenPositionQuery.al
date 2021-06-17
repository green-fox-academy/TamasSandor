codeunit 50102 OpenPositionQuery
{

    procedure Getposition(ApplicantRecord: Record Applicant): Integer
    var
        PositionQuery: Query "PositionQuery";
        PositionCounter: Integer;
    begin
        if PositionQuery.Open then begin
            PositionCounter := 1;
            while PositionQuery.Read do begin
                if PositionQuery.MoneyPerMember < ApplicantRecord.MoneyPerMember then begin
                    PositionCounter += 1;
                end else begin
                    exit(PositionCounter);
                end;
            end;
        end;
    end;
}