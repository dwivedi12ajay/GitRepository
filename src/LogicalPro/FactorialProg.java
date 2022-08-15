package LogicalPro;

public class FactorialProg {

	public static void main(String[] args) {
		int number =7;
		int factorial=1 ;
		
		for(int i=1;i<=number;i++) {
			
			factorial = factorial*i;// 1=1*1, 1*2,2*3,6*4,24*5,120*6,720*7
		}
        System.out.println("factorial of number is = "+ factorial);
	}

}
