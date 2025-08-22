package c_Abstraction;

public class Car {

//    user doesnot want to know this so we hide this information and use this in other methods.
//    private void movepiston(){
//        System.out.println("Piston moved");
//    }
//
//    private void diskbreak(){
//        System.out.println("Apply disk break");
//    }


    public void accelerate(){
        System.out.println("acceleration starts");
//        movepiston();
    }

    public void breaks(){
        System.out.println("breaks applied");
//        diskbreak();
    }






}
