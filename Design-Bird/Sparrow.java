public class Sparrow extends Bird implements Flying {
    FlyingBehavior fb;
    Sparrow(FlyingBehavior fb){
        this.fb = fb;
    }
    public void fly(){
        fb.makefly();
    }
}
