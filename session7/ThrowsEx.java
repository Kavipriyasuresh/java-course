package session7;

public class ThrowsEx {
	public static int divideNumber (int m, int n) throws
		ArithmeticException,ArrayIndexOutOfBoundsException {
	        int div = m/n;
	        String[] name = {"java","python","node"	};
	        
	        System.out.println(name[3]);
	        return div;
		
	}
	public static void main(String[] args) {
		//ThrowsEx te = new Throwsex();
		try {
			System.out.println(divideNumber(45,5));
		}catch(ArithmeticException e) {
			System.out.println("\n number cannot br divide by 0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound");
		}
	}
}
