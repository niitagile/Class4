package Encapsulation;
 class Outer{
     static String msg="Hello All!!!";
    static class Inner{
        int num=20;
        void message(){
            System.out.println(msg);
        }
    }

    void display(){
        System.out.println("num="+new Inner().num);
    }
}
public class StaticClassExample {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.message();
    }

}
