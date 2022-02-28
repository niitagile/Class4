package Encapsulation;
class Outer1{
    private int num=90;
    class Inner {
        String msg = "Java Classes";

        void display() {
            System.out.println(num);
        }
    }
        void showInnerData(){
            System.out.println("msg="+new Inner().msg);
        }

}
public class InnerClassExample {
    public static void main(String[] args) {
        Outer1 obj=new Outer1();
        Outer1.Inner obj1=obj.new Inner();
        obj.showInnerData();
        obj1.display();

    }
}
