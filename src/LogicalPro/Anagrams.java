package LogicalPro;

import java.util.TreeSet;

public class Anagrams {

	public static void main(String[] args) {
		String s1= "Race";
		String s2="Care";
		
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		
			
		TreeSet set1 = new TreeSet();
		for(int i=0; i<s3.length(); i++) {
			set1.add(s3.charAt(i));
		}
		
		TreeSet set2 = new TreeSet();
		for(int i=0; i<s4.length(); i++) {
			set2.add(s4.charAt(i));
		}
		
		if(set1.equals(set2)) {
			System.out.println("String s1 and s2 are anagrams");
		}
		else {
			System.out.println("String are not anagrams");
		}
		

	}

}
