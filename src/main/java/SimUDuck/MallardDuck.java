package SimUDuck;

public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWing();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a new Mallard SimUDuck");
    }
}
