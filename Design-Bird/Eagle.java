public class Eagle extends Bird implements Flying {
    FlyingBehavior fb;
    Eagle(FlyingBehavior fb){
        this.fb=fb;
    }
    public  void  eat(){
        System.out.println("Eagle can eat");
    }

    public void fly(){
        fb.makefly();
    }
}
