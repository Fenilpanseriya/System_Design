package modals;

public  abstract class  BoardEntity {
    private BoardEntityTypes entityTypes;
    int startPos;
    int endPos;

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
