public class Fish extends Animal implements CanSwim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim(Terrain terrain) {
        if (terrain.canMove(this)) {
            System.out.println(this.getName() + "(" + this.getClass().getSimpleName() + ") can swim on "
                    + terrain.getName() + "(" + terrain.getClass().getSimpleName() + ")");
        } else {
            System.out.println(this.getName() + "(" + this.getClass().getSimpleName() + ") can not swim on "
                    + terrain.getName() + "(" + terrain.getClass().getSimpleName() + ")");
        }
    }
}