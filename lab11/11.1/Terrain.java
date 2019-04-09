public abstract class Terrain {
    private String name;

    public Terrain(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract boolean canMove(Animal animal);

}