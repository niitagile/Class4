package Encapsulation;
abstract class Person{
    abstract void eat();
}
/*class Human extends Person{

    @Override
    void eat() {
        System.out.println("Vegetarian");
    }
}*/
public class TestAnoy {
    public static void main(String[] args) {
        Person p=new Person(){
            void eat() {
                System.out.println("Vegetarian");
            }
        };
        p.eat();
    }
}
