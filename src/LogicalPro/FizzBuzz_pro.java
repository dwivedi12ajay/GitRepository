package LogicalPro;

public class FizzBuzz_pro {

	public static void main(String[] args) {
	for(int i=1;i<=20;i++) {
		if(i%4==0 && i%5==0) {
			System.out.println(i+"FizzBuzz");
		}
		else if(i%4==0) {
			System.out.println(i+"Fizz");
		}
		else if(i%5==0) {
			System.out.println(i+"Buzz");
		}
		else {
			System.out.println(i);
		}
	}

	}

}
