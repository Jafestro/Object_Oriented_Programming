/* Thread class to count the number of positive elements in a section of a matrix */
import java.util.ArrayList;
public class MatHunter extends Thread {
    int [][] matrix;
    int iLo, iHi, jLo, jHi;
    int found;

    /* constructor gets the matrix and the indices specifying what section to examine */
    MatHunter(int [][] matrix, int iLo, int iHi, int jLo, int jHi) {
        this.matrix = matrix;
        this.iLo = iLo; this.iHi = iHi;
        this.jLo = jLo; this.jHi = jHi;

        found = 0;
    }

    /* examine a section of a 2D matrix and count the number of positive elements */
    public void run() {
        for (int i = iLo; i <= iHi; i++) {
            for (int j = jLo; j <= jHi; j++)
                if (matrix[i][j] > 0)
                    found++;
        }
    }

    public int getFound() {
        return found;
    }
}

class TaskSplitDemo {
    private static final int N = 2000;

    public static void execute(int[][] matrix, int cores) {
        /* split the task to individual threads */
        ArrayList<MatHunter> mathunters = new ArrayList<>();
        int dy = N/cores;
        int slicey = 0;
        for (int i = 0; i < cores; i++) {
            mathunters.add(new MatHunter(matrix, 0, N-1, slicey, slicey+dy-1));
            slicey += dy;
        }

        /* start treads */
        long start = System.nanoTime();
        for (MatHunter mh : mathunters)
            mh.start();

        /* wait for them to complete their tasks, and collect results */
        int result = 0;
        for (MatHunter mh : mathunters) {
            try {
                mh.join();
            } catch (InterruptedException e) {
                // thread was interrupted, the result may be incorrect
                e.printStackTrace();
            }
            result += mh.getFound();
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Time elapsed " + timeElapsed/10e6 + " ms. The result is " + result);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[N][N];

        /* create a matrix having zeros and random number of ones */
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (Math.random() > 0.5)
                    matrix[i][j] = 1;

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Our system has " + cores + " processor cores\n");
        System.out.print("1 Thread(s): "); execute(matrix, 1);
        System.out.print("1 Thread(s): "); execute(matrix, 1);
        System.out.print(cores + " Thread(s): "); execute(matrix, cores);
    }
}