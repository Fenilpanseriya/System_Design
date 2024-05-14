package modals;

import java.util.HashMap;
import java.util.Map;

public class Player {
    Map<Integer,Button>buttons=new HashMap<>();
    int id;
    public Player(){}
    public void setButtons(int id,Button button){

        buttons.put(id, button);
        System.out.println("map is "+buttons);
    } 
    public Button getButtons(int id) {
        return buttons.get(id);
    }
    public Map<Integer,Button> getAllButtons(){
        return buttons;
    }
}
