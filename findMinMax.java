
public class findMinMax {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, -3, 5 };

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i< numbers.length; i++) {
            max = (numbers[i] > max) ? numbers[i] : max;
            min = (numbers[i] < min) ? numbers[i] : min;
        }

        System.out.println("max = " + max + " min = " + min);
    }
}
