public class Refil implements RefilPen {
    private PenType type;
    private InkColor ink;

    Refil(InkColor color){
        this.ink=color;
    }

    public InkColor getInk() {
        return ink;
    }

    public void changeRefil(){
        
        System.out.println("change refil");
        
    }
    public InkColor getColor(){
        return ink;
    }

}
