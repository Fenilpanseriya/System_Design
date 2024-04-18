package prototype_design_pettern;

public abstract class Bird  {
    
    public String name;
    public String color;
    public Bird(){}

    public Bird(Bird old){
        this.color=old.color;
        this.name=old.name;
    }
    public abstract Bird makeClone();
    
}
