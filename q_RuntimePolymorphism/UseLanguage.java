package q_RuntimePolymorphism;

public class UseLanguage {
    public static void main(String[] args) {

        Language obj;
        obj=new Hindi();
        obj.greetings();

        obj=new English();
        obj.greetings();

        obj=new French();
        obj.greetings();



    }
}
