query 50103 NoDonation
{
    QueryType = Normal;

    elements
    {
        dataitem(Applicant; Applicant)
        {
            column(Name; Name) { }

            dataitem(Charity; Charity)
            {
                DataItemLink = ApplicantId = Applicant.Id;
                SqlJoinType = LeftOuterJoin;

                column(ApplicantId; ApplicantId) { }
            }
        }
    }
}