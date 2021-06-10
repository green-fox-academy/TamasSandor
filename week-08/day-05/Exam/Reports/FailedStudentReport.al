report 50100 FailedStudentReport
{
    UsageCategory = Administration;
    ApplicationArea = All;
    DefaultLayout = RDLC;
    RDLCLayout = 'FailedStudents.rdl';

    dataset
    {
        dataitem(ExamResultTable; ExamResult)
        {
            RequestFilterFields = StudentScore;
            column(StudentScore; StudentScore) { }

            dataitem(ExamTable; Exam)
            {
                DataItemLink = Id = field(ExamId);
                column(SubjectName; SubjectName) { }

                dataitem(StudentTable; Student)
                {
                    DataItemLinkReference = ExamresultTable;
                    DataItemLink = Id = field(StudentId);

                    column(StudentName; Name) { }
                }
            }
        }
    }
}