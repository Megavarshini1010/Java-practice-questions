//Operators in java
public class Operators {
    public static void main(String[] args) {
        int a=145;
        int b=120;
        //Arithmetic Operators
        System.out.println("Arithmetic operator:");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println();
        //Relational operators
        System.out.println("Relational operator:");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println();
        //Logical operators
        System.out.println("Logical operator:");
        System.out.println(a==b&&a>=b); //Both conditions are true,returns true
        System.out.println(a==b||a<=b); //Either one condition true,returns true
        System.out.println(!(a==b));    //a&b is not equal it returns true otherwise return false. 
        System.out.println();
        //Assignment operator
        System.out.println("Assignment operator:");
        System.out.println(a=b);
        System.out.println(a+=b); //a=a+b;
        System.out.println(a-=b); //a=a-b;
        System.out.println(a*=b); //a=a*b;
        System.out.println(a/=b); //a=a/b;
        System.out.println(a%=b); //a=a%b;
        System.out.println();
    //Unary Operator
    System.out.println("Unary operator:");
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(-a);
        System.out.println(-a);
        System.out.println();
    //Tenary operator:condition ?true_result:false_result
    System.out.println("Ternary Operator:");
         int ternery = (a>b)?a:b;
        System.out.println(ternery);   
        System.out.println(); 
    //Bitwise operator
    System.out.println("Bitwise operator:");
        System.out.println(a^b);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println();
    }
}
