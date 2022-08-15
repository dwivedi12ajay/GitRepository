package LogicalPro;

public class MinSortedArray {

	public static void main(String[] args) {

			int [] arr = {1, 45, 67, 98, 455, 678};
			int min = Integer.MAX_VALUE;
			for(int elements:arr) {
				
				if(elements<min) { //here last minimum value is 1 below this there is no any value less
                // than 1 hence value 1 satisfied given condition in if statement

					min=elements;
				}
				
			
			}
			System.out.println("min value is = "+min);
	}

}
