codeunit 50100 SubjectDateSeed
{

    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        SubjectRecord: Record Subject;
    begin
        if SubjectRecord.IsEmpty then begin
            InserSubject(1, 'IT');
            InserSubject(2, 'English');
            InserSubject(3, 'Maths');
            InserSubject(4, 'Science');
            InserSubject(5, 'History');
        end;
    end;

    local procedure InserSubject(Id: Integer; Name: Text[100])
    var
        SubjectRecord: Record Subject;
    begin
        SubjectRecord.Id := Id;
        SubjectRecord.Name := Name;
        SubjectRecord.Insert();
    end;
}