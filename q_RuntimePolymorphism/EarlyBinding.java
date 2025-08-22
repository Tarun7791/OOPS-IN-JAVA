package q_RuntimePolymorphism;

public class EarlyBinding {
    public static void main(String[] args) {

        Parent p=new Child();
        p.display(); // Example of late binding kyuki object dekhkar method call ho rahi hai and dono display alag output de rahe hai!
        Parent.show();

        p=new Parent();
        p.display();
        Parent.show(); // Example of early binding kyuki reference dekhkar method call ho rahi hai and it is not polymorphic.











    }
}
