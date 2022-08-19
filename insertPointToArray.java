
import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class insertPointToArray {
    public static void main(String[] args) {
        System.out.print("how many elements? (max 20): ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n > 20 || n <= 0) {
            System.out.print("invalid, try again: ");
            n = input.nextInt();
        }

        Point[] points = new Point[n];

        fillArrayOfPoints(points);
        printArrayOfPoints(points);
    }

    public static void fillArrayOfPoints(Point[] points) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < points.length; i++) {
            System.out.print("now enter x and y for point " + (i + 1) + ": ");

            points[i] = new Point(input.nextInt(), input.nextInt());
        }
    }

    private static void printArrayOfPoints(Point[] points) {
        System.out.println("You entered: ");
        for (int i = 0; i < points.length; i++) {
            System.out.println("(" + points[i].x + ", " + points[i].y + ")");
        }
    }

}
