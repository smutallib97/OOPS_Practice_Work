package basics;
//by no. changing arguments
//by no. data types
public class Addition {
    int add(int a, int b)
    {
        return a+b;
    }
   // int add(int a, int b,int c)
    double add(double a, double b, double c)
    {
        return a+b+c;
    }

    class Overloading{
        public static void main(String[] args) {
            Addition ad = new Addition();

            ad.add(12, 23);
            ad.add(12,23, 26);

        }
    }
}
