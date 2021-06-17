codeunit 50100 DataSeed
{
    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        DonatorRecord: Record Donator;
        CategoryRecord: Record Category;
        ApplicantRecord: Record Applicant;

    begin
        if DonatorRecord.IsEmpty then begin
            InsertDonator(1, 'Bill Gates');
            InsertDonator(2, 'Warren Buffet');
            InsertDonator(3, 'Melinda Gates');
            InsertDonator(4, 'Mother Teresa');
            InsertDonator(5, 'Donald Trump');
        end;
        if CategoryRecord.IsEmpty then begin
            InsertCategory(1, 'Food');
            InsertCategory(2, 'Toys');
            InsertCategory(3, 'Clothes');
            InsertCategory(4, 'Cash');
        end;
        if ApplicantRecord.IsEmpty then begin
            InsertApplicant(1, 'Poor Joe', 400, 7, 1);
            InsertApplicant(2, 'Oliver Twist', 600, 5, 3);
            InsertApplicant(3, 'John Favreau', 900, 9, 3);
            InsertApplicant(4, 'Billy Joel', 750, 8, 2);
            InsertApplicant(5, 'Lucas Smith', 300, 7, 4);
            InsertApplicant(6, 'Lil Kim', 200, 3, 1);
        end;

    end;

    local procedure InsertDonator(Id: Integer; Name: Text[100])
    var
        DonatorRecord: Record Donator;
    begin
        DonatorRecord.Id := Id;
        DonatorRecord.Name := Name;
        DonatorRecord.Insert(true);
    end;

    local procedure InsertCategory(Id: Integer; Name: Text[100])
    var
        CategoryRecord: Record Category;
    begin
        CategoryRecord.Id := Id;
        CategoryRecord.Name := Name;
        CategoryRecord.Insert();
    end;

    local procedure InsertApplicant(Id: Integer; Name: Text[100]; MonthlyIncome: Decimal; FamilySize: Integer; CategoryId: Integer)
    var
        ApplicantRecord: Record Applicant;
    begin
        ApplicantRecord.Id := Id;
        ApplicantRecord.Name := Name;
        ApplicantRecord.MonthlyIncome := MonthlyIncome;
        ApplicantRecord.FamilySize := FamilySize;
        ApplicantRecord.CategoryId := CategoryId;
        ApplicantRecord.MoneyPerMember := MonthlyIncome / FamilySize;
        ApplicantRecord.Insert();
    end;
}