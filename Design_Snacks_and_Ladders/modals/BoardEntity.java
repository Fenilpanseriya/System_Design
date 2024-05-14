package modals;

public  abstract class  BoardEntity {
    BoardEntityTypes entityTypes;
    int startPos;
    int endPos;

    public BoardEntity(int start,int end,BoardEntityTypes type){
        this.endPos=end;
        this.startPos=start;
        this.entityTypes=type;
    }

    public int getEndPos() {
        return endPos;
    }
    public BoardEntityTypes getEntityTypes() {
        return entityTypes;
    }
    public int getStartPos() {
        return startPos;
    }
    
}
