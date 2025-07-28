//How to get input from User using Scanner class
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=input.next();
        System.out.print("Enter your age:");
        int age=input.nextInt();
        System.out.print("Enter your City:");
        String city =input.next();

        

    }
}
