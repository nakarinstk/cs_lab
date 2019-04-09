public class Sky extends Terrain {
    public Sky(String name) {
        super(name);
    }

    @Override
    public boolean canMove(Animal animal) {
        return (animal instanceof CanFly) ? true : false;
    }
}