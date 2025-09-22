package Recursion.Pattern;

public class Triangle {

    public static void main(String[] args) {

        triangle(4, 0);
        triangle2(4, 0);

    }

    // Reverse triangle (ulta pattern)
    static void triangle(int rows, int cols) {
        if (rows == 0) {
            return;
        }

        if (cols < rows) {

            System.out.print("* ");
            triangle(rows, cols + 1);

        } else {
            System.out.println();

            triangle(rows - 1, 0);

        }
    }

    // Normal triangle (seedha pattern)
    static void triangle2(int rows, int cols) {
        if (rows == 0) {
            return;

        }

        if (cols < rows) {
            triangle2(rows, cols + 1);
            System.out.print("* ");

        } else {
            triangle2(rows - 1, 0);
            System.out.println();

        }

    }

}
