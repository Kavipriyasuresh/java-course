package programs;

import java.util.Scanner;

public class amountcal {
	public static void main(String[] args) {
		int amt1, amt2, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount1:");
		amt1 = sc.nextInt();
		System.out.println("enter amount2:");
		amt2 = sc.nextInt();
		
		res = amt1 + amt2;
		
		if(res<60)
		{
			System.out.println("res is less than 60");
		}
		else
		{
			System.out.println("res is greater than 60");
		
		}
	}

}
