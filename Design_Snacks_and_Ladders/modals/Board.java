package modals;

import java.util.Map;

public class Board {
    private int dimension;
    private Map<Integer,BoardEntity>m;

    public Board(int dimension){
        this.dimension=dimension;
    }
    public Map<Integer, BoardEntity> getMap() {
        return m;
    }
}
