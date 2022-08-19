import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 3, 4, };

        System.out.print("choose a number to find out its occurence: ");
        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        int count = 0;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == choice){
                count ++;
            }
        }

        System.out.println(choice + " occurs " + count + " times");

    }
}