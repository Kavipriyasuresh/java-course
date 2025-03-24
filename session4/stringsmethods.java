package session4;
import java.util.Scanner;

public class stringsmethods {
	public static void main(String[] args) {
		String s1 ="java program";
		
		//1.length
		/*System.out.println(s1.length());
		
		//2.equal()
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter username: ");
		String username = sc.nextLine();
		
		System.out.println("enter password:");
		String password = sc.nextLine();
		
		if(username.equals("admin") && password.equals("adim@123")){
		  System.out.println("successs");
		}
		else
		{
			System.out.println("error 404 not found");
		}*/
		//==operator
//		String s2 = "Madhu";
//		String s3 = "Madhu";
//		
//		System.out.println(s2==s3);
//		
//		
//		//compare too 
//		String s4 = "heuits";
//		String s5 = "hellos";
//		
//		System.out.println(s4.compareTo(s5));
//		
		//concat()
//		String str1 = "static";
//		String str2 = new String("program");
//		System.out.println(str1.concat(str2));
	
		//toCharArray()
		String str3 = "welcome to java";
		System.out.println("value of mehtod: ");
		
		char[] ch = str3.toCharArray();
		for(char st : ch) {
		System.out.println(st);
		}
		//substring()
		/*System.out.println(str3.substring(5));
		System.out.println(str3.substring(0,9));
		
		//intern
		String clg = "kgisl";
		String clg1 = new String("kgisl");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);*/
	}

}
