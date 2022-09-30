package basics;

    class Vehicle{
        int a;
        void run(){
            System.out.println("Vehicle is running");
        }
    }
    class Bike extends Vehicle{

        void run(){
            System.out.println("Bike is running");
        }
    }



public class TestOverriding {
    public static void main(String[] args) {
        Vehicle bk = new Bike();

        bk.run();
    }
}
