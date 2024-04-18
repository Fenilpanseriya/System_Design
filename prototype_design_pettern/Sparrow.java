package prototype_design_pettern;

public class Sparrow extends Bird {
    public int legSize;
    public Sparrow(){
        
    }
    public Sparrow(Sparrow old){
        super(old);
        this.legSize=old.legSize;
     }
        
    public Bird makeClone(){
        
        return new Sparrow(this);
    }

}
