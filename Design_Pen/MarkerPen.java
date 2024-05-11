public class MarkerPen extends Pen implements RefilPen{

    public MarkerPen(){
        super(PenType.MARKER,new SmoothWriting());
    }
    public void changeRefil(){

    }
    public InkColor getColor(){
        return InkColor.BLUE;
    }
}
