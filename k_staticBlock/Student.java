package k_staticBlock;

public class Student {
    public static double pi=3.14;

    public Student(){
        System.out.println("Constructor called");
    }

    static {
        System.out.println("Static block called");
    }
}
