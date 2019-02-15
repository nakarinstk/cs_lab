import java.util.Random;

/**
 * CityGrid
 */
public class CityGrid {
    private int posX;
    private int posY;
    private int gridSize;
    Random rand = new Random();

    public CityGrid(int usrInput) {
        if (usrInput % 2 == 0) {
            this.gridSize = usrInput;
            this.posX = gridSize / 2;
            this.posY = gridSize / 2;
        } else {
            throw new IllegalArgumentException("Please enter even number");
        }
    }

    public void walk() {
        int randWalk = rand.nextInt(4);
        if (randWalk == 0) {
            posX -= 1;
        } else if (randWalk == 1) {
            posX += 1;
        } else if (randWalk == 2) {
            posY += 1;
        } else {
            posY -= 1;
        }
    }

    public boolean isInCity() {
        if ((posX >= 0 && gridSize >= posX) && (posY >= 0 && gridSize >= posY)) {
            return true;
        } else {
            return false;
        }
    }

    public void reset() {
        this.posX = gridSize / 2;
        this.posY = gridSize / 2;
    }

    public static void main(String[] args) {
        CityGrid test = new CityGrid(10);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 10001; i++) {
            for (int j = 0; i < 1001; j++) {
                test.walk();
                if (test.isInCity()) {
                    continue;
                } else {
                    sum += j;
                    if (j > max) {
                        max = j;
                    }
                    break;
                }
            }
            test.reset();
        }
        System.out.printf("Average number of steps that a person can take and is still in the city: %.2f \n",
                (sum / 1000.0));
        System.out.println("Maximum number of steps that a person can take and is still in the city: " + max);
    }
}