package prototype_design_pettern;
import java.util.*;

public class Registery {
    private Map<String,Bird> birds = new HashMap<>();
    
    public Registery(){
        Crow crow=new Crow();
        crow.name= "crow";
        crow.color="black";
        crow.sound="krow krow";

        Sparrow s=new Sparrow();
        s.name="sparrow";
        s.color="white";
        s.legSize=2;

        registerBird("crow", crow);
        registerBird("sparrow", s);

    }

    public void registerBird(String name,Bird b){
        birds.put(name,b);
    }

    public Bird cloneBird(String name){
        return birds.get(name).makeClone();
        
    }
}
