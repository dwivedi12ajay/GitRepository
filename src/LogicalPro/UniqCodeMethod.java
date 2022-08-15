package LogicalPro;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;

public class UniqCodeMethod {

	public static void main(String[] args) {

		String str1 = "w3resource.com";
		String str2 = " america.com";
		
		int w =str1.codePointAt(0);
		System.out.println( str1.codePointCount(1, 10));
		System.out.println(w);
		System.out.println(str1.concat(str2));
		
		String str3 = "example.com";
		String str4 = "Example.com";
		StringBuffer Sb= new StringBuffer(str3);
		System.out.println(str3.contentEquals(Sb));
		
		// Calendar C = Calendar.getInstance();

//				 System.out.format("%tB %te, %tY%n",C, C, C);
//		 System.out.format("%tl:%tM %tp%n",C, C, C);
		
		
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
