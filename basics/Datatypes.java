package basics;

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Primitive Data Types

        System.out.println("Enter a byte range number :");
        byte b = sc.nextByte(); //-128 to 127
        System.out.println("Byte Number is :" +b);

        System.out.println("Enter a short range number :");
        short s = sc.nextShort(); // -32768 to 32767
        System.out.println("Short Number is :" +s);

        System.out.println("Enter a integer range number :");
        int i = sc.nextInt(); // -2147483648 to 2147483647
        System.out.println("Integer Number is :" +i);

        System.out.println("Enter a long range number :");
        long l = sc.nextLong(); //-9223372036854775808 to -9223372036854775807
        System.out.println("long Number is :" +l);

        System.out.println("Enter a float number :");
        float f = sc.nextFloat(); //decimal point till 6 to 7
        System.out.println("long Number is :" +f);

        System.out.println("Enter a double number :");
        double d = sc.nextDouble(); //decimal point till 15
        System.out.println("Double number is: " +d);

        boolean b1 = true;
        System.out.println("Boolean Value is : " +b1);

        System.out.println("Enter a Character :");
        char c = sc.next().charAt(0);
        System.out.println("Entered Character is: " +c);

        System.out.println("Enter Name");
        String s1 = sc.next();
        System.out.println("Name is :" +s1);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Given Array Number is: " +arr);
    }
}
