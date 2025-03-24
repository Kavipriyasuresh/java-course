package session4;

public class constructor {
	
	public constructor() {
		System.out.println("Default constructor");
	}
	
	public constructor(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Paramaterized Constructor");
		
	}
	
	public int sum(int a, int b) {
		   int res = a + b;
		   return res;
	}
      public static void main(String[] args) {
		 constructor cx = new constructor();
		 constructor c = new constructor("Ruba","19");
		 
		 System.out.println(c.sum(5, 10));
		 
		 
	}
}
