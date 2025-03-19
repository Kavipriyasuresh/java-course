package session3;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		//length of an array
		int[] num = {10,20,30,40,50};
		System.out.println("length of num:"+num.length);
		
		//copying an array
		int[] source = {1,2,3,4,5};
		int[] destination = new int[5];
		
		//copy array
		System.arraycopy(source, 0, destination, 0, source.length);
		
		for(int i : destination) {
			System.out.println(i+ " ");
		}
		
		//array sort
		int[] b = {1,2,3,4,5};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//array fill
		int[] d = new int[5];
		Arrays.fill(d, 1);
		Arrays.fill(d, 1,4,2);
		System.out.println(Arrays.toString(d));
	}

}
