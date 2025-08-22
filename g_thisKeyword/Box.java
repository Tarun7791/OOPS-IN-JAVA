package g_thisKeyword;
// this keyword is used for constructor chaining

import java.rmi.dgc.Lease;

public class Box {

    private int length;
    private int breadth;
    private int height;

    public Box(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public Box(int side){
        this(side,side,side);
    }

    public Box(){
        this(0,0,0);
    }

    public void show(){
        System.out.print("Length is "+length+" ");
        System.out.print("Breadth is "+breadth+" ");
        System.out.println("Height is "+height+" ");
    }



}
