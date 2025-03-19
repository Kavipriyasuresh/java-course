package programs;

public class bitwise {
	public static void main(String[] args) {
		int a = 5, b = 3; //binary 5-->0101, 3-->0011
		System.out.println("bitwise AND :"+ (a & b));
		System.out.println("bitwise OR :"+ (a | b));
		System.out.println("bitwise XOR :"+ (a ^ b));
		System.out.println("bitwise NOT :"+ (~a));
		
		/***
		 * AND
		 * 0101
		 * 0011
		 * -----
		 * 0001-->1
		 * ----
		 * OR
		 * 0101
		 * 0011
		 * -----
		 * 0111 -->7
		 * -----
		 */
		
	}

}
