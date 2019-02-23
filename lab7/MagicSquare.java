
/**
 * MagicSquare
 */
public class MagicSquare {
    private int dim, modDim;
    private Integer[][] board;

    public MagicSquare(int usrInput) {
        dim = usrInput;
        board = new Integer[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                board[i][j] = 0;
            }
        }
        modDim = dim - 1;
    }

    public void run() {
        int val = 2;
        int i = modDim;
        int j = modDim / 2;
        board[i][j] = 1;
        for (int k = 0; k < (dim * dim) - 1; k++) {
            if (((i == modDim) && (j == modDim))) {
                i--;
            } else {
                i++;
                j++;
            }
            if (i > modDim) {
                i = 0;
            }
            if (j > modDim) {
                j = 0;
            }
            if ((board[i][j] != 0)) {
                j--;
                i = i - 2;
            }
            // Debug Stuff :)
            // System.out.println("loop:" + k + " i: " + i + " j: " + j);
            // System.out.println(val);
            // System.out.println("------------------------");
            board[i][j] = val;
            val++;
        }

    }

    public String toString() {
        run();
        String r = "";
        for (int i = 0; i < dim; i++) {
            r = r + "|";
            for (int j = 0; j < dim; j++) {
                r = r + ":" + board[i][j] + ":";
            }
            r = r + "|\n";
        }
        return r;
    }
}