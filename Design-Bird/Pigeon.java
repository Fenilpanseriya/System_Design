public class Pigeon extends Bird implements Flying {
    public  void  eat(){
        System.out.println("pigeon can eat");
    }
    FlyingBehavior fb=new PigeonSparrowFlyingBehavior();
    public void fly(){
        fb.makefly();
    }
}
