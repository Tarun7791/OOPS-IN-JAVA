package b_Encapsulation;

public class Student {

    private int roll=287;
    private char grade='A';
    private double percentage=91.0;


    public void setData(int r,char g, double per){
        roll=r;
        grade=g;
        percentage=per;
    }

//    Correct way of writing setter:
//    public void setData(int roll,char grade, double percentage){
//        this.roll=roll;
//        this.grade=grade;
//        this.percentage=percentage;
//    }



    public void showData(){
        System.out.println("Your roll no. is "+roll);
        System.out.println("Your grade is "+grade);
        System.out.println("Your percentage is "+percentage);
    }







}
