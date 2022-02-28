package LambdaExample;
interface Division{
	int calculation(int a, int b);
}

public class LambdaAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Division obj=(a,b)->{
			return output;
		}*/
				
		Division obj=(a,b)->{
			if(b!=0)
				return a/b;
			else
				return 0;
		};
		
		System.out.println(obj.calculation(5, 3));
		Division obj1=(a,b)-> a+b;
		int output=obj1.calculation(4,6);
		System.out.println("square of output="+output*output);


	}

}
