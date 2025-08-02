//Find area and perimeter of Rectangle
import java.util.Scanner;

public class FindArea{
    public static void main(String[] args) {
        //Input of width and height
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        float width= sc.nextFloat();
        System.out.println("Enter the height of the Rectangle:");
        //Calculate area and perimeter
        float height=sc.nextFloat();
        float  area =width*height;
        float perimeter = 2 * (width+height);
        //Print output 
        System.out.println("Area of Rectangle is:"+area);
        System.out.println("Perimeter of Rectangle is:"+perimeter);
    }
}