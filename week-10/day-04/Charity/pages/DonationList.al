page 50109 DonationList
{
    PageType = List;
    ApplicationArea = All;
    UsageCategory = Lists;
    SourceTable = Donation;
    Editable = false;
    CardPageId = DonationCard;

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
                field(DonatorId; Rec.DonatorId)
                {
                    ApplicationArea = All;

                }
                field(CategoryId; Rec.CategoryId)
                {
                    ApplicationArea = All;

                }
                field(Worth; Rec.Worth)
                {
                    ApplicationArea = All;

                }
                field(IsDonated; Rec.IsDonated)
                {
                    ApplicationArea = All;

                }
                field(DonatorName; Rec.DonatorName)
                {
                    ApplicationArea = All;

                }
                field(CategoryName; Rec.CategoryName)
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
        area(Processing)
        {
            action(NoDonation)
            {
                ApplicationArea = All;
                Promoted = true;
                PromotedCategory = Process;

                trigger OnAction()
                var
                    NoDonationQuery: Query NoDonation;
                    Applicants: Text[2048];
                begin
                    if NoDonationQuery.Open() then begin
                        while NoDonationQuery.Read() do begin
                            if NoDonationQuery.ApplicantId = 0 then begin
                                Applicants += NoDonationQuery.Name + ', ';
                            end;
                        end;
                        Message('%1', Applicants.Substring(1, StrLen(Applicants) - 2));
                    end;
                end;
            }
            action(MostDonation)
            {
                ApplicationArea = All;
                Promoted = true;
                PromotedCategory = Process;

                trigger OnAction();
                var
                    MostDonationQuery: Query MostDonationQuery;
                begin
                    if MostDonationQuery.Open() then begin
                        if MostDonationQuery.Read() then begin
                            Message('%1 with %2 donation',
                            MostDonationQuery.DonatorName,
                            MostDonationQuery.DonatorId);
                        end;
                    end;
                end;
            }
        }
    }
}