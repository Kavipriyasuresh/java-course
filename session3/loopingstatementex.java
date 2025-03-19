package session3;


public class loopingstatementex {
	public static void main(String[] args) {
		int i = 10;
		while(i<10) { //while loop
			System.out.println("value of i:"+i);
			i++;
		}
		System.out.println("final value of i: "+i);
		int d = 10;
		do {      // do while
			System.out.println("value:"+d);
			d--;
		}while(d>=1);
		System.out.println("final value of d: "+d);
		
		//for loop
		int a;
		for( a = 1; a<=15; a++) {
			System.out.println("the value of a:" +a);	
		}
		System.out.println("the final value of a:"+a);
		
		
		
		
		//nested for loop
		int rows = 5;
		for(int b = 0; b<=rows; b++) { //b=1
			for(int c = 0; c<=b; c++) {      // c<=rows-b print reverse // c<=b print 1 to 5
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int e = 1; e<=5; e++) {
			for(int f = 1; f<e+1; f++) {
				System.out.print(f+ " ");
			}
			System.out.println();
		}
		int row = 8;
		for(int b = 0; b<=row; b++) { //b=1
			for(int c = 1; c>=row-b; c++) {      // c<=rows-b print reverse // c<=b print 1 to 5
				System.out.print(" * ");
			}
			System.out.println();

			}
	}
}
		
		
		
		 
		
	

	
	


