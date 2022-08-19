
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        System.out.print("enter your name: ");
        System.out.println(getName());

        System.out.print("enter your age: ");
        System.out.println(getAge());
    }

    public static String getName() {

        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

    public static Integer getAge() {
        Scanner age = new Scanner(System.in);

        return age.nextInt();
    }
}
