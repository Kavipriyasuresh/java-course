package programs;

import java.util.Scanner;

public class Switchex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("select an operation");
		
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
		System.out.println("enter the choice (1/2/3/4):");
		int choice =sc.nextInt();
		
		System.out.println("enter first number:");
		double num1 = sc.nextDouble();
		
		System.out.println("enter the second number:");
		double num2 =sc.nextDouble();
		
		double result;
		
		switch(choice) {
		case 1:
			result = num1 + num2;
			System.out.println("result:" +result);
			break;
			
		case 2:
			result = num1 - num2;
			System.out.println("result:" +result);
			break;
			
		case 3:
			result = num1 * num2;
			System.out.println("result:" +result);
			break;
			
		case 4:
			if(num2 !=0) {
			result = num1 / num2;
			System.out.println("result:" +result);
			}else {
				System.out.println("error:division by zero not allowed");
			}
			break;
	default:
	     System.out.println("invalid choice select the correct choice");
			
		}
	}

}
