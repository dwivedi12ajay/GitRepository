package LogicalPro;

public class PalindromeProg {

	public static void main(String[] args) {
		String Ori = "anana";
		String Rev = "";
		
		for(int i=Ori.length()-1; i>=0; i--) {
			Rev = Rev + Ori.charAt(i);
		}
		System.out.println(Rev);
		
		System.out.println(Ori.equals(Rev));

	}

}
