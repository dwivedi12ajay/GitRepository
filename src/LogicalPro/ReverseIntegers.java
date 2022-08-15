package LogicalPro;

public class ReverseIntegers {

	public static void main(String[] args) {
		int a =123456789;
		int b=0;
		
		while(a!=0) {
			
			b=b*10 +a%10;
			a=a/10;
			
			
		}
		System.out.println(b);
	}

}
