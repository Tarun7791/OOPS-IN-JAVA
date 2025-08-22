package e_GetterandSetter;

public class UseVehicle {
    public static void main(String[] args) {

        Vehicle obj;
        obj=new Vehicle();

        obj.setColor("Red");
        String color=obj.getColor();

        System.out.println("The colour of the car is "+color);








    }
}
