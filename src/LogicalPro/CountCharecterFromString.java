package LogicalPro;

public class CountCharecterFromString {
	
	
	public static void main(String[] args) {
		

		String s1= "ChapaChapaCharakaChale";
		int count=0;
		int a =0;
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)=='C') {
				count = count + 1;
			}
			else if(s1.charAt(i)=='a') {
				a = a +1;
			}
		}
		
		System.out.println("Total Count of Variable C is  = "+ count);
		System.out.println( "Total count of Variable a is = "+ a);
		
	}

}
