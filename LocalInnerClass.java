package Encapsulation;
class Order{
    String pname;
    public int price,qty;
    public int bill() {
        int amount=price*qty;
        class Inner {
            int dis=10;
            int calc(){
               return amount-dis;
            }

        }
        Inner in_obj=new Inner();
        if (amount>2000)
        return in_obj.calc();
        else
            return amount;
    }



}
public class LocalInnerClass {
    public static void main(String[] args) {
        Order t1=new Order();
        t1.price=100;
        t1.qty=20;
        System.out.println("Your bill is="+t1.bill());
    }


}
