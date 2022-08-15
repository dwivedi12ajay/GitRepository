package LogicalPro;

import java.util.Scanner;

public class ScannerProgram {
	

	public static void main(String[] args) {
		
	int id;
	String name;
	Scanner scan = new Scanner(System.in);
	System.out.println("enter id and name");
	id =scan.nextInt();
	name=scan.next();
	System.out.println("id = " +id);
	System.out.println("name = "+ name);
	}
}
