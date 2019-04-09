/**
 * Cat
 */
public class Cat extends Animal implements CanWalk {
    public Cat(String name) {
        super(name);
    }

    public void walk(Terrain terrain) {
        if (terrain.canMove(this)) {
            System.out.println(this.getName() + "(" + this.getClass().getSimpleName() + ") can walk on "
                    + terrain.getName() + "(" + terrain.getClass().getSimpleName() + ")");
        } else {
            System.out.println(this.getName() + "(" + this.getClass().getSimpleName() + ") can not walk on "
                    + terrain.getName() + "(" + terrain.getClass().getSimpleName() + ")");
        }
    }

    public void run(Terrain terrain) {
        if (terrain.canMove(this)) {
            System.out.println(this.getName() + "(" + this.getClass().getSimpleName() + ") can run on "
                    + terrain.getName() + "(" + terrain.getClass().getSimpleName() + ")");
        } else {
            System.out.println(this.getName() + "(" + this.getClass().getSimpleName() + ") can not run on "
                    + terrain.getName() + "(" + terrain.getClass().getSimpleName() + ")");
        }
    }
}