
package basics;
import java.util.Random;
public class Hello {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("Random Value is:  " +num);
    }
}
