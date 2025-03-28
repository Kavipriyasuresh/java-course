package session7;

import java.util.Scanner;

public class ErrorEx {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		
		assert(age>0)&&(age>120);//error condition
		System.out.println("the entered age is:"+age);
	}

}
