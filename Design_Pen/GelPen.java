public class GelPen extends Pen implements RefilPen{
    private Refil refil;
    private boolean chnageRefil=false;
    private Builder builder;

    private GelPen(Builder b){
        super(PenType.GEL,new SmoothWriting());
        this.builder=b;
    }

    public static class Builder{
        private Refil refil;
        private boolean changeRefil=false;

        public  Builder  setRefil(Refil r){
            this.refil=r;
            return this;
        }
        public Builder setChangeRefil(boolean b){
            this.changeRefil=b;
            return this;
        }

        public GelPen build(){
            GelPen gelPen=new GelPen(new Builder());
            gelPen.refil=this.refil;
            gelPen.chnageRefil=this.changeRefil;

            return gelPen;
        }
        public InkColor getInkColor(){
            return refil.getColor();
        }
    }

    public void changeRefil(){
        
        System.out.println("change refil");
        
    }
    public InkColor getColor(){
        return builder.getInkColor();
    }
}
