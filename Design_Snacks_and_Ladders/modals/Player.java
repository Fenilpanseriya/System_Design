package modals;

import java.util.HashMap;
import java.util.Map;

public class Player {
    Map<Integer,Button>buttons=new HashMap<>();
    int id;
    public void setButtons(int id,Button button){
        buttons.put(id, button);
    } 
    public Button getButtons(int id) {
        return buttons.get(id);
    }
    
}
