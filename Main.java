import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question ="is earth flat?";
        String choiceOne ="yes";
        String choiceTwo = "no";
        String choiceThree = "it's octagon";


        System.out.println(question);
        System.out.println("answer" + choiceOne + " or " + choiceTwo + " or " + choiceThree);
        Scanner s = new Scanner(System.in);
        String userInput = s.next();

        if (choiceTwo.equals(userInput)) {
            System.out.println("congrats! you are not dumb");
        }else {
            System.out.println("oh no");
        }
    }
}
