package LogicalPro;

public class CountUpper_lowerCaseProg {

	public static void main(String[] args) {
		
String s1="AutoMatIon";
String upper ="";
String lower="";
System.out.println(s1.codePointAt(8));
System.out.println(s1.codePointAt(1));
for(int i =0 ; i<s1.length();i++) {

	char ch = s1.charAt(i);
	
	if(ch>=97 && ch<=117) {// 97 for last Uppercase P and 117 for starting of lowecase u
		lower =  lower  + ch;
	}
	else {
		upper = upper + ch;
	}
	
}

System.out.println(upper);
System.out.println("Upper Case lenght="+upper.length());
System.out.println(lower);
System.out.println("Lower Case length="+lower.length());
}}
