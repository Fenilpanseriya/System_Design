public class Main {
    public static void main(String[] args) {
        Penguin p=new Penguin();
        
        p.eat();
        p.notfly();

        Eagle e=new Eagle(new CrowEagleFlyingBehavior());
        e.fly();

        Sparrow s=new Sparrow(new PigeonSparrowFlyingBehavior());
        s.fly();
    }
}
