package d_Constructor;

public class Account {

    private int accid;
    private String name;
    private double balance;

//    Non-Parameterized constructor
//    public Account(){
//        accid=7791;
//        name="Tarun";
//        balance=120023;
//    }

//    Parameterized constructor
    public Account(int id, String s, double bal){
        accid=id;
        name=s;
        balance=bal;
    }

    public void showDetails(){
        System.out.println("Sir, your account id is "+accid);
        System.out.println("Sir, your name is "+name);
        System.out.println("Sir, your balance is "+balance);
    }



}
