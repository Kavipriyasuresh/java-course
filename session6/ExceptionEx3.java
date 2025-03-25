package session6;

public class ExceptionEx3 {
	static void validateAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}else {
			System.out.println("age is valid");
		}
	}
	public static void main(String[] args) {
		try {
			validateAge(15);
		}catch(IllegalArgumentException e) {
			System.out.println("caught an exception:"+e.getMessage());
		}
	}

}
