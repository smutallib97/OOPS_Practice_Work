package constructor;

public class Birds {
    String s1;
    private Birds(){
        s1 = "Peacock, Parrot, Sparrow";
    }

    public static void main(String[] args) {
        Birds bd = new Birds();
        System.out.println(bd.s1 + " These are the very popular birds");
    }
}
