//Primitive Datatypes in java
public class PrimitiveDt{
    public static void main(String[] args) {
        //-128 to 127
        byte value1 = 127;
        //-32,768 to 32,767
        short value2 =32211;
        //-2,147,483,648 to 2,147,483,647
        int value3=456789;
        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long value4= 55555555;
        // ±3.40282347 × 10³⁸
        double value5=4554.5646778898888888d;
        // ±1.79769313486231570 × 10³⁰⁸
        float value6 = 3.6543550f;
        //0 to 65,535 (represents Unicode characters)
        char value7 ='s';
        //true or false
        boolean value8 =true;  
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
    }
}