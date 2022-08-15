package LogicalPro;

public class MaxValueArray {

	public static void main(String[] args) {
		int [] arr = {1, 45, 67, 98, 455, 678};
		int max =Integer.MIN_VALUE;
		
		for(int elements :arr)
		{
			if(elements>max) {// in elements all value is stored  in max min value stored at 678 
//	max=elements because after 678 there is no an value 
		
				max = elements;
			}
		}
		System.out.println("max value is = " +max);
			
		}
	}


