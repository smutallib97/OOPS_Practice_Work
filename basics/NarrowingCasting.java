package basics;

public class NarrowingCasting {
    public static void main(String[] args) {
        double d = 112.45152548; //takes 15 decimal digits
        System.out.println("Before Conversion Value is :" +d);
        float f = (float) d; // takes 5 to 6 decimal digits
        System.out.println(" After converting in float value is:" +f);
        long l = (long) f;
        System.out.println(" After converting in long value is: " +l);
        int i = (int) l;
        System.out.println(" After converting in integer value is: " +i);
    }
}
