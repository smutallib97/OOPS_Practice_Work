package abtraction;
//abstract class
abstract class Department{
    public void display(){
        System.out.println("This is Production Department");
    }
}
class Production extends Department {
    public static void main(String[] args) {
        Production prod = new Production();
        prod.display();
    }
}
