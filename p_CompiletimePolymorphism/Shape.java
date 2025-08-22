package p_CompiletimePolymorphism;

public class Shape {

    public void area(double radius){
        double area =Math.PI*Math.pow(radius,radius);
        System.out.println("The area of the circle is "+area);
    }

    public void area(int side){
        int area=side*side;
        System.out.println("The area of the square is "+area);
    }

    public void area(int length, int breadth){
        int area=length*breadth;
        System.out.println("The area of the rectangle is "+area);
    }







}
