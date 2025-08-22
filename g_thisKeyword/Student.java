package g_thisKeyword;

public class Student {
    private int roll;
    private String name;
    private double percentage;

    public void setDetails(int roll, String name, double percentage){
        this.roll=roll;
        this.name=name;
        this.percentage=percentage;
    }

    public void getDetails(){
        System.out.println("The roll no. is "+roll);
        System.out.println("The name is "+name);
        System.out.println("The percentage is "+percentage);
    }
}
