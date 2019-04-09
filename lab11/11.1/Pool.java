public class Pool extends Terrain {
    public Pool(String name) {
        super(name);
    }

    public boolean canMove(Animal animal) {
        return (animal instanceof CanSwim) ? true : false;
    }
}