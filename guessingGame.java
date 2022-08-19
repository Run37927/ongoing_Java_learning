
import java.util.ArrayList;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            showMenu();
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("enter an integer: ");
                integers.add(input.nextInt());
                System.out.println("added");
            } else if (choice == 2) {
                System.out.print("enter the number to be removed: ");
                int elementToRemove = input.nextInt();

                if (integers.contains(elementToRemove)) {
                    integers.remove(Integer.valueOf(elementToRemove));
                    System.out.println("removed");
                } else {
                    System.out.println("not found");
                }
            } else if (choice == 3) {
                System.out.println("Your list: " + integers);
            } else {
                System.out.println("Bye");
                break;
            }
        }
    }

    private static void showMenu() {
        System.out.print("1. Add\n" + "2. Remove\n" + "3. Display\n" + "4. Exit\n\n" + "Your Choice: ");
    }


}
