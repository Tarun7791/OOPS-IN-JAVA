package i_staticKeyword;

public class UseDemo {
    public static void main(String[] args) {

        Demo obj1=new Demo();
        Demo obj2=new Demo();
        Demo obj3=new Demo();

        obj1.a=2;
        obj2.a=3;
        obj3.a=4;

        System.out.println("obj1.a is "+obj1.a+" obj2.a is "+obj2.a+" obj3.a is "+obj3.a);

//        obj1.b=33;
//        obj2.b=44;
//        obj3.b=55;

        Demo.b=33;
        Demo.b=343;
        Demo.b=353;


        System.out.println("obj1.b is "+Demo.b+" obj2.b is "+Demo.b+" obj3.b is "+Demo.b);




    }
}
