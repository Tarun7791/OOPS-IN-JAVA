package o_FinalKeyword;

public class area {
    private final double pi=3.14;
    private double marks=99.2;

    public void changed(){
        marks=44.5;
//        pi=55.4;  cannot assign a value to final variable pi
        System.out.println("pi is "+pi);
        System.out.println("Marks is "+marks);
    }
}
