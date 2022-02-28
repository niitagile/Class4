package LambdaExample;
interface interface2{
    void say();
}
public class LambdaInstanceVariable {
    String name="Leena";
    static String msg="Hello";
    void display(){
        interface2 obj=()-> System.out.println(msg+ " "+this.name);
        obj.say();
    }
    public static void main(String[] args) {

       // interface2 obj=()-> System.out.println(this.name);
        LambdaInstanceVariable lm=new LambdaInstanceVariable();
        lm.display();
    }
}
