//Calculate area and circumference of circle using radius 
import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        //Using Final keyword tos et pi value;
        final float  pi = 3.14f;
        //Take the radius as ainput from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle:");
        int radius=sc.nextInt();
        //Calculation of area and circumference
        double Area= (pi*Math.pow(radius,2));
       double  Circumference=2*pi*radius;
       //Print the value;
        System.out.println("Area of Cicle:"+Area);
        System.out.println("Circumference of Circle:"+ Circumference);
        
    }
    
}
