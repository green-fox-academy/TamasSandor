page 50106 CharityList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Charity;
    Editable = false;
    CardPageId = CharityCard;

    layout
    {
        area(Content)
        {
            repeater(GroupName)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }
                field(DonationId; Rec.DonationId)
                {
                    ApplicationArea = All;

                }
                field(ApplicantId; Rec.ApplicantId)
                {
                    ApplicationArea = All;

                }

            }
        }
        area(Factboxes)
        {

        }
    }

    actions
    {
        area(Navigation)
        {
            //From the CharityList page you can access the 
            //DonationList, ApplicantList, DonatorList pages
            action(ToDonationList)
            {
                ApplicationArea = All;
                RunPageMode = view;
                RunObject = page DonationList;
            }
            action(ApplicantList)
            {
                ApplicationArea = All;
                RunPageMode = view;
                RunObject = page ApplicantList;
            }
            action(ToDonatorList)
            {
                ApplicationArea = All;
                RunPageMode = view;
                RunObject = page DonatorList;
            }
        }
    }
}