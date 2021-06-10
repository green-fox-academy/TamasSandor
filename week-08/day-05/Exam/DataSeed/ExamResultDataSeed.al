codeunit 50103 ExamResultDaatSeed
{
    Subtype = Install;

    trigger OnInstallAppPerCompany()
    var
        ExamResultRecord: Record ExamResult;
    begin
        if ExamResultRecord.IsEmpty then begin
            InsertExamResult(1, 1, 50, 2, true);
            InsertExamResult(2, 2, 60, 3, true);
            InsertExamResult(3, 3, 80, 1, true);
            InsertExamResult(4, 4, 0, 2, false);
        end;
    end;

    local procedure InsertExamResult(Id: Integer; StudentId: Integer; StudentScore: Integer; ExamId: Integer; Attended: Boolean)
    var
        ExamResultRecord: Record ExamResult;
    begin
        ExamResultRecord.Id := Id;
        ExamResultRecord.StudentId := StudentId;
        ExamResultRecord.StudentScore := StudentScore;
        ExamResultRecord.ExamId := ExamId;
        ExamResultRecord.Attended := Attended;
        ExamResultRecord.Insert();
    end;
}