package LogicalPro;

public class DifferentElementOfSameType {

	public static void main(String[] args) {
		String s1= "Ch*apa7C?ha9ra<0kaCh.2ale";
		int upcount=0;
		int lwcount=0;
		int nmcount=0;
		int spcount=0;
		
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch>='A'&& ch<='Z') {
				upcount++;
			}
			else if(ch>='a'&& ch<='z') {
				lwcount++;
			}
			else if(ch>='0' && ch<='9') {
				nmcount++;
			}
			else {
				spcount++;
			}
		}
		
		System.out.println("Uppercase count = "+ upcount);
		System.out.println("Lowercase count = "+lwcount);
		System.out.println("Number count = "+nmcount);
		System.out.println("Special character count = "+spcount);

	}

}
