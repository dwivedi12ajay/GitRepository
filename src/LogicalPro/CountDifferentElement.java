package LogicalPro;

public class CountDifferentElement {

	public static void main(String[] args) {
		String s= "Chhh32545@#$%88**NAMEgold";
		 int uppercount=0;
		 int lowercount=0;
		 int  numbercount=0;
		 int specialnumbercount=0;
		 
		 for(int i =0;i<s.length();i++) {
			 char ch = s.charAt(i);
			 
			 if(ch>='A' && ch<='Z') {
				 uppercount++;
				 
			 }
			 else if(ch>='a' && ch<='z') {
				 lowercount++;
			 
			 }
			 else if(ch>='0' && ch<='9') {
				
				 numbercount++;
				 
			 }
			 else {
				 specialnumbercount++;
			 }
			 
			
			 
			 
		 }
		 
		 System.out.println("uppercount = " + uppercount);
		 System.out.println("lowercount = " + lowercount);
		 System.out.println("numbercount = " +numbercount );
		 System.out.println("specialnumbercount = " +specialnumbercount);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
