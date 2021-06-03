codeunit 50100 DataSeed
{
    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        AuthorRecord: Record Author;
        BookRecord: Record Book;
    begin
        if AuthorRecord.IsEmpty then begin
            InsertAuthor(1, 'Author1');
            InsertAuthor(2, 'Author2');
            InsertAuthor(3, 'Author3');
        end;

        if BookRecord.IsEmpty then begin
            InsertBook(1, 'BookTitle1', 100, 1);
            InsertBook(2, 'BookTitle2', 200, 2);
            InsertBook(3, 'BookTitle3', 300, 3);
        end;
    end;

    local procedure InsertAuthor(Id: Integer; Name: Text[100])
    var
        AuthorRecord: Record Author;
    begin
        AuthorRecord.Id := Id;
        AuthorRecord.Name := Name;
        AuthorRecord.Insert();
    end;

    local procedure InsertBook(Id: Integer; Title: Text[100]; PageCount: Integer; AuthorId: Integer)
    var
        BookRecord: Record Book;
    begin
        BookRecord.Id := Id;
        BookRecord.Title := Title;
        BookRecord.PageCount := PageCount;
        BookRecord.AuthorId := AuthorId;
        BookRecord.Insert();
    end;
}