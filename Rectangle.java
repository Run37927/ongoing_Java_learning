
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle[] recs = new Rectangle[3]; // null, null, null at this point

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < recs.length; i++) {
            System.out.print("do you want to enter width and height?(y/n) ");
            char choice = input.next().charAt(0); // can be y/n

            if (choice == 'y') {
                recs[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            } else {
                recs[i] = new Rectangle();
            }
        }

        System.out.println("The rectangles are: ");
        for (int i = 0; i < recs.length; i++) {
            System.out.println("Rectangle " + (i+1) + ": width: " + recs[i].getWidth() + ", height: " + recs[i].getHeight());
        }
    }
}
