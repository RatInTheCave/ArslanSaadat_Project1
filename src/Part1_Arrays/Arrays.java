package Part1_Arrays;

public class Arrays {


    //Part 1: 2D Arrays.
    public static void main(String[] args) {
        int[][] Array1 = initializeArray1(5, 5);
        topic0(Array1);
        topic1(Array1);
        topic2(Array1);
        topic3(Array1);
        topic4(Array1);
    }

    public static int[][] initializeArray1(int N, int M) {
        int[][] result = new int[N][M];
        int Value = 0;
        for (int[] row : result) {
            for (int col = 0; col < row.length; ++col) {
                row[col] = Value;
                Value++;
            }
            //row = col;
        }
        return result;
    }

    public static void topic0(int[][] Array) {
        for (int row = 0; row < Array.length; ++row) {
            for (int col = 0; col < Array[0].length; ++col) {
                System.out.print(Array[1][0] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void topic1(int[][] Array) {
        for (int row = 0; row < Array.length; ++row) {
            for (int col = 0; col < Array[0].length; ++col) {
                System.out.print(Array[0][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void topic2(int[][] Array) {
        for (int row = 0; row < Array.length; ++row) {
            for (int col = 0; col < Array[0].length; ++col) {
                System.out.print(Array[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void topic3(int[][] Array) {
        for (int row = 0; row < Array.length; ++row) {
            for (int col = Array[0].length - 1; col >=0 ; --col) {
                System.out.print(Array[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void topic4(int[][] Array) {
        for (int row = Array.length - 1; row >= 0; --row) {
            for (int col = Array[0].length - 1; col >=0 ; --col) {
                System.out.print(Array[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

