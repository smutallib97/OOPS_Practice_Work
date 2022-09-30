package constructor;

public class My_Name {
    private String name;
    //constructor
    My_Name(){
        name = "Sayyed Mutallib";
    }

    public static void main(String[] args) {
        My_Name mn = new My_Name();
        System.out.println("My Name is " +mn.name);
    }
}
