import java.util.ArrayList;

public class InterfaceProject {
    public static void main(String[] args) {
        Ground ground1 = new Ground("Bangkok Ground");
        Pool pool1 = new Pool("Chula swimming pool");
        Sky sky1 = new Sky("Japan Sky");
        System.out.println("**************1*************");
        Fish fish1 = new Fish("Nemo");
        fish1.swim(ground1);
        fish1.swim(pool1);
        fish1.swim(sky1);
        System.out.println("****************************");

        System.out.println("**************2*************");
        Cat cat1 = new Cat("Garfield");
        cat1.walk(ground1);
        cat1.walk(pool1);
        cat1.walk(sky1);

        cat1.run(ground1);
        cat1.run(pool1);
        cat1.run(sky1);
        System.out.println("****************************");

        System.out.println("**************3*************");
        Bird bird1 = new Bird("Red Angry Bird");
        bird1.walk(ground1);
        bird1.walk(pool1);
        bird1.walk(sky1);

        bird1.run(ground1);
        bird1.run(pool1);
        bird1.run(sky1);

        bird1.fly(ground1);
        bird1.fly(pool1);
        bird1.fly(sky1);
        System.out.println("****************************");

        ArrayList<Terrain> terrains = new ArrayList();
        terrains.add(ground1);
        terrains.add(pool1);
        terrains.add(sky1);
        ArrayList<Animal> animals = new ArrayList();
        animals.add(cat1);
        animals.add(fish1);
        animals.add(bird1);
        System.out.println("**************4*************");

        for (Animal animal : animals) {
            for (Terrain terrain : terrains) {
                if (animal instanceof CanWalk) {
                    ((CanWalk) animal).walk(terrain);
                    ((CanWalk) animal).run(terrain);
                }
                if (animal instanceof CanSwim) {
                    ((CanSwim) animal).swim(terrain);
                }
                if (animal instanceof CanFly) {
                    ((CanFly) animal).fly(terrain);
                }
            }
            System.out.println("****************************");
        }
        for (Animal animal : animals) {
            for (Terrain terrain : terrains) {
                if (animal instanceof CanWalk) {
                    ((CanWalk) animal).walk(terrain);
                    ((CanWalk) animal).run(terrain);
                }
                if (animal instanceof CanSwim) {
                    ((CanSwim) animal).swim(terrain);
                }
                if (animal instanceof CanFly) {
                    ((CanFly) animal).fly(terrain);
                }
            }
            System.out.println("****************************");
        }
    }
}