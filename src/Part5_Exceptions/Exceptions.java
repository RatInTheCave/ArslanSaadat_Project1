package Part5_Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Part 5.1");
        TryCatch();
        System.out.println("Part 5.2");
        TryCatchFinally();
    }

    public static void TryCatch() {
        int[] ArrayExample1 = {1, 2, 3};
        try {
            System.out.println(ArrayExample1[4]);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("An exception occurred.");
        }
    }

    public static void TryCatchFinally() {
        int[] ArrayExample2 = {1, 2, 3};
        try {
            System.out.println(ArrayExample2[3]);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("An exception occurred.");
        } finally {
            System.out.println("TryCatchFinally finished");
        }
    }
}




