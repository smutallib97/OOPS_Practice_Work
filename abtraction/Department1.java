package abtraction;

abstract class Department1 {
    //abstract method
    abstract void Grinding_Machine();

    public void Muratek_Machine() {
        System.out.println("Muratek Machine is working with 4 manpower");
    }
}
    class Production1 extends Department1{
        public void Grinding_Machine(){
            System.out.println("Grinding Machine is working with 6 Manpower");
        }
    }
    class Main{
        public static void main(String[] args) {
            Production1 prod1 = new Production1();
            prod1.Grinding_Machine();
            prod1.Muratek_Machine();
        }
}
