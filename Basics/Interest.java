//Calculate Simple and Compound Interest
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        //Take the input from user
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        float Amount = sc.nextFloat();
        System.out.println("Enter the Rate of interest(%): ");
        float Interest = sc.nextFloat();
        System.out.println("Enter the time(in year):");
        float Time = sc.nextFloat();
       //Formulea for Calculation
       float SimpleInterest = (Amount*Interest*Time)/100;
       //must cast Math.pow()  result to float because it returns a double
       float CompoundInterest = (float) (Amount*Math.pow((1+Interest/100.0f),Time)-Amount);
 System.out.println("Simple Interest:"+SimpleInterest);
 System.out.println("Compound Interest :"+CompoundInterest);
    }
}
