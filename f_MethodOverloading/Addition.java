package f_MethodOverloading;

public class Addition {


//    We can do method overloading in three types:
//    Type01: By changing data types of the parameters

    public int addition(int a,int b){
        return (a+b);
    }
    public double addition(double a,double b){
        return (a+b);
    }

//    Type02: By changing the number of arguments

    public int addition(int a,int b,int c){
        return (a+b+c);
    }

    public int addition(int a,int b,int c, int d){
        return (a+b+c+d);
    }

//    Type03: By changing the order of arguments

    public String addition(int a, String st){
        return (a+st);
    }

    public String addition (String st, int a){
        return (st+a);
    }












}
