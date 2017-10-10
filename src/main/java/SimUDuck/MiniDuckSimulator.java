package SimUDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();

        mallard.display();
    }
}
