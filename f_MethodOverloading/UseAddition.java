package f_MethodOverloading;

public class UseAddition {
    public static void main(String[] args) {
        
        Addition obj;
        obj=new Addition();

        System.out.println(obj.addition(33,44));
        System.out.println(obj.addition(22.3,323.2));

        System.out.println( obj.addition(2,3,4));
        System.out.println(obj.addition(2,3,4,5));

        System.out.println(obj.addition(2,"Tarun"));
        System.out.println(obj.addition("Tarun",2));






    }
}
