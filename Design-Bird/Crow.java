public class Crow extends Bird implements Flying{
    public  void  eat(){
        System.out.println("Crow can eat");
    }
    FlyingBehavior fb=new CrowEagleFlyingBehavior();
    public void fly(){
        fb.makefly();
    }
}
