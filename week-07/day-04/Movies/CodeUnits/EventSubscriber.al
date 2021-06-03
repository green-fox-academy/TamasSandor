codeunit 50100 EventSubscriber
{
    [EventSubscriber(ObjectType::Table, Database::Movie, 'OnAfterInsertEvent', '', true, true)]
    local procedure MyProcedure(var Rec: Record Movie)
    var
        DirectorRecord: Record Director;
    begin
        DirectorRecord.Get(Rec.DirectorId);
        DirectorRecord.CalcFields(TotalMovies);
        Message('DirectorName: %1, # of movies directed: %2', DirectorRecord.Name, DirectorRecord.TotalMovies);
    end;
}