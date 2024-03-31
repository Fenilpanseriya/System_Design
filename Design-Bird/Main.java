//Requirements
// there should be 5 birds sparrow,eagle,crow,penguin,pigeon
//1. Flying behavior of sparrow and pigeon is same
//2. Flying behavior of Eagle and crow is same
//3. Penguin can not fly
//4. all birds can eat
// 

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
