package LambdaExample;
@FunctionalInterface
interface Sayable{
	void say();
}
interface Messanger{
	MethodRef getMessage(String msg);
}
class MethodRef{
	
	MethodRef(){
		System.out.println("Constructor");
	}
	MethodRef(String str){
		System.out.println(str);
	}
	public static void display(){
		System.out.println("Hello Everyone");
	}
}
public class LambdaMethods {
	public static void main(String[] args) {
		
		Sayable sayable= MethodRef::display;// put body of display method in say method as botha re having same signature
											//and display is static method so call it with name of class
		sayable.say();
		Sayable s1=MethodRef::new;//Sayable s1=new MethodRef();
		s1.say();
		Messanger msg=MethodRef::new;
		msg.getMessage("Meassanger");//parameterized constructor*/
		
	}

}
