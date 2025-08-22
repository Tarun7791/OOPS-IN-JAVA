package h_ArgumentPassing;

public class Student {
    int marks=50;
    public static void main(String[] args) {
        Student s1=new Student();
        update(s1);
        System.out.println(s1.marks);
    }

    public static void update(Student s){
        s.marks=100;
        s=new Student();
        s.marks=200;
    }


}

