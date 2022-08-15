package LogicalPro;

import java.util.HashSet;

public class DeleteCharecterFromMixNumChar {

	public static  void main(String[] args) {
		String s= "SuperMan12345678789";
		
		String values ="";
		String charecter="";
		//search aski values of A to Z ,a to z ,0 to 9 and put in if else condition
		//ascii value of 0 to 9 is 48 to 57
		//a to z is 97 to 122
		//A to Z is 65 to 90
	//	System.out.println(s.codePointAt(11));
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch>=48 && ch<=57) {
				
				values =values+ch;	
			
			}
			
//			else {
//			
//			
//				charecter = charecter +ch;
//				
//			}
//			
		}
		
		System.out.println(values);
		System.out.println("values length  = "+values.length());
//		System.out.println(charecter);
//		System.out.println("charecter  Length = "+charecter.length());
		 
		 
	
		
		
			      
		 }
		
	

	}


