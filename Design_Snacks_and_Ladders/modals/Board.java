package modals;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int dimension;
    private Map<Integer,BoardEntity>m=new HashMap<>();

    public Board(){
        this.m=new HashMap<>();
    }

    public Board(int dimension){
        this.dimension=dimension;
    }
    public Map<Integer, BoardEntity> getMap(){
        return  m;
    }

    public int getDimension() {
        return dimension;
    }

    public void setEntityMap(int id, BoardEntity e) {
        m.put(id,e);
    }
}
