package Inheritance;


//invoking parent class with the use of super keyword
public class SuperKeyword {
    int a;
    void SuperKeyword(){
        System.out.println("This is Parent Method");
    }
}
class C extends SuperKeyword{

    void display(){
        super.SuperKeyword();
    }

    public static void main(String[] args) {
        C c = new C();
        c.display();
    }

}

