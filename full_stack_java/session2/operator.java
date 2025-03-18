package programs;

public class operator {
	public static void main(String[] args) {
		int a = 3, b = 10;
		//arithmetic
		System.out.println("addition"+(a+b));
		System.out.println("subtraction"+(a-b));
		System.out.println("multiplication"+(a*b));
		
		//relation
		System.out.println("equal to"+(a==b));
		System.out.println("not equal"+(a!=b));
		System.out.println("greater than"+(a>b));
		System.out.println("less than equal to"+(a<=b));
		
		//logical
		boolean condition1 = true, condition2 = false;
		System.out.println("Logical AND"+(condition1 && condition2));
		System.out.println("Logical OR"+(condition1 || condition2));
		System.out.println("Logical NOT"+(!condition1));
		
		//unary
		System.out.println("post increment"+(b++));
		System.out.println("pre decrement"+(--a));
		
		//assignment
		a+=5; //a = a+5
		System.out.println("+=: "+a);
		
		//ternary ? :
		String res = (a>b)?"a is greater" : "b is greater";
		System.out.println("result:" + res);
		
		//bitwise
		/***
		 * AND-->&
		 * OR-->|
		 * NOT-->~
		 * XOR-->^
		 */
		 
		
	}

}
