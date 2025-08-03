import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //Actual username and password
        String Createusername ="admin";
        String Createpassword ="5455";
        Scanner sc = new Scanner(System.in);
        //Input from user
        System.out.println("Enter the Username:");
        String username = sc.nextLine();//String allows Complex characters and easy to compare using (.equals)
        System.out.println("Enter the Password:");
        String password = sc.nextLine();
        //Condition for check credentials of user
        if(Createusername.equals(username)&&Createpassword.equals(password)){
            System.out.println("Login Successfully");
        }
        else{
            System.out.println("Incorrect username and passwords");
        }

    }
}
