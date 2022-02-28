package LambdaExample;



import java.util.function.Consumer;
/*interface Consumer<T>{
	void accept(T t);
}*/
public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> biCon2= (name)->System.out.println(name.toLowerCase());
		
		biCon2.accept("Ashish");
		biCon2.accept("Nishant");

	}

}

