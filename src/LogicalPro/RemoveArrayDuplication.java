package LogicalPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveArrayDuplication {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersListWithoutDuplicate);
		
		

	}

}
