//Convert the user input from Celsius to Fahrenhiet;
import java.util.Scanner;

public class CeltoFah{ 
    public static void main(String[] args) {
Scanner find = new Scanner(System.in);
System.out.println("Enter temperature in celsius:");
double celsius = find.nextDouble();
double fahrenheit= celsius*1.8 + 32;
System.out.println(celsius+"°C is equal to " + fahrenheit+"°F"); 
}
}