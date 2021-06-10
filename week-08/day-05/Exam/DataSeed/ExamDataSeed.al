codeunit 50102 ExamDataSeed
{
    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        ExamRecord: Record Exam;
    begin
        if ExamRecord.IsEmpty then begin
            InsertExam(1, 'Exam1', 2021, 100, 3);
            InsertExam(2, 'Exam2', 2022, 80, 2);
            InsertExam(3, 'Exam3', 2023, 100, 4);
            InsertExam(4, 'Exam4', 2024, 100, 5);
        end;
    end;

    local procedure InsertExam(Id: Integer; Name: Text[100]; DueDate: Integer; MaxScore: Integer; SubjectId: Integer)
    var
        ExamRecord: Record Exam;
    begin
        ExamRecord.Id := Id;
        ExamRecord.Name := Name;
        ExamRecord.DueDate := DueDate;
        ExamRecord.MaxScore := MaxScore;
        ExamRecord.SubjectId := SubjectId;
        ExamRecord.Insert();
    end;
}