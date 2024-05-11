public class BallPen extends Pen implements RefilPen{
    public BallPen(){
        super(PenType.BALL,new SmoothWriting());
    }

    public void changeRefil(){

    }
    public InkColor getColor(){
        return InkColor.BLACK;
    }
}
