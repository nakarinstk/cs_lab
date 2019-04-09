public class Ground extends Terrain {
    public Ground(String name) {
        super(name);
    }

    public boolean canMove(Animal animal) {
        return (animal instanceof CanWalk) ? true : false;
    }
}