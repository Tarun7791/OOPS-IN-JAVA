package h_ArgumentPassing;
//Passing values

public class add {
    public static void main(String[] args) {

        int x=10;
        int y=20;
        System.out.println("Before increment "+"x is "+x+" y is "+y);

        increment(x,y);

        System.out.println("after increment "+"x is "+x+" y is "+y);

















    }

    public static void increment(int a,int b){
        a=a+5;
        b=b+5;
    }




}
