table 50104 Charity
{
    DataClassification = ToBeClassified;

    fields
    {
        field(1; Id; Integer)
        {
            DataClassification = ToBeClassified;

        }
        field(2; DonationId; Integer)
        {
            TableRelation = Donation.Id where(IsDonated = const(false));

            trigger OnValidate()
            begin
                if DonationId <= 0 then begin
                    FieldError(DonationId, 'This cannot be negative');
                end;
            end;

        }
        field(3; ApplicantId; Integer)
        {
            TableRelation = Applicant;
            trigger OnValidate()
            begin
                if DonationId <= 0 then begin
                    FieldError(DonationId, 'This cannot be negative');
                end;
            end;

        }
    }

    keys
    {
        key(PK; Id)
        {
            Clustered = true;
        }
    }

    var
        DonationRecord: Record Donation;
        ApplicantRecord: Record Applicant;


    trigger OnInsert()
    begin
        DonationRecord.Get(DonationId);
        ApplicantRecord.Get(ApplicantId);
        DonationRecord.IsDonated := true;

        if DonationRecord.CategoryId <> ApplicantRecord.CategoryId
         then begin
            Error('The categories must match')
        end;

        Validate(ApplicantId);
        Validate(DonationId);
    end;

    trigger OnModify()
    begin
        Validate(ApplicantId);
        Validate(DonationId);
    end;

    trigger OnDelete()
    begin

    end;

    trigger OnRename()
    begin

    end;

}