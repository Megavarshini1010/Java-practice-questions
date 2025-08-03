import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year:");
        int year =sc.nextInt();
        //Logic for finding leap or non-leap year
        if(year%4==0&&year!=0||year%400==0){
            System.out.println(year+" "+"is a Leap Year");
        }
        else{
            System.out.println(year+" "+"is a not leap year");
        }
    }
}
