
import java.util.Arrays;
import java.util.Scanner;

public class insertNumToArray {
    public static void main(String[] args) {
        System.out.print("how many elements? (max 20): ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n > 20 || n <=0) {
            System.out.print("invalid, try again: ");
            n = input.nextInt();
        }

        int[] numbers = new int[n];

        fillArray(numbers);
        printArray(numbers);
    }

    public static void fillArray(int[] numbers) {
        System.out.print("now enter the numbers: ");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i< numbers.length; i ++) {
            numbers[i] = input.nextInt();
        }
    }

    private static void printArray(int[] numbers) {
        System.out.print("You entered: ");
        System.out.println(Arrays.toString(numbers));
    }

}
