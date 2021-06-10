codeunit 50101 StudentDateSeed
{

    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        StudentRecord: Record Student;
    begin
        if StudentRecord.IsEmpty then begin
            InsertStudent(1, 'Soproni Miklos', 'Mikike@valami.com', GenderEnum::Male, 20181120D);
            InsertStudent(2, 'Sinka Zoltan', 'Zolika@valami.com', GenderEnum::Male, 20171120D);
            InsertStudent(3, 'Sandor Tamas', 'Tomika@valami.com', GenderEnum::Male, 20161120D);
            InsertStudent(4, 'Teper Alex', 'Alexka@valami.com', GenderEnum::Male, 20151220D);
            InsertStudent(5, 'Szilagyi Zoltan', 'Zolika2@valami.com', GenderEnum::Male, 20181121D);
        end;
    end;

    local procedure InsertStudent(Id: Integer; Name: Text[150]; Email: Text[150]; Gender: Enum GenderEnum; Birth: Date)
    var
        StudentRecord: Record Student;
    begin
        StudentRecord.Id := Id;
        StudentRecord.Name := Name;
        StudentRecord.Email := Email;
        StudentRecord.Gender := Gender;
        StudentRecord.Birth := Birth;
        StudentRecord.Insert();
    end;
}