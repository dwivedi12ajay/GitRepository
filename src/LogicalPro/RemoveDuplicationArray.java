package LogicalPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicationArray {

	public static void main(String[] args) {
	
		ArrayList a = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0));
		LinkedHashSet E = new LinkedHashSet<>(a);
		ArrayList b = new ArrayList<>(E);
		System.out.println(b);
		
		
		

	}

}
