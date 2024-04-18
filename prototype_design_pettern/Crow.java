package prototype_design_pettern;

public class Crow extends Bird {
    public  String sound;
    public Crow(){
        
    }
    public Crow(Crow old){
        super(old);
        this.sound=old.sound;
     }
        
    public Bird makeClone(){
        
        return new Crow(this);
    }

}
