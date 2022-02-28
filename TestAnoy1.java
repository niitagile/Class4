package Encapsulation;
interface Lifecycle{
    void state();
    void display();
}
public class TestAnoy1 {
    public static void main(String[] args) {
        Lifecycle ls=new Lifecycle() {
            @Override
            public void state() {
                System.out.println("State management");
            }

            @Override
            public void display() {

            }
        };
        ls.state();
        ls.display();
    }

}
