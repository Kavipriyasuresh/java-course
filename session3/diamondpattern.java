package session3;

import java.util.Scanner;

public class diamondpattern {
	public static void main(String[] args) {
		//diamond pattern

				Scanner sc = new Scanner(System.in);

				

				System.out.println("Enter no .of rows : ");

				int rows = sc.nextInt();

				

				//top half of the diamond

				for(int i=1;i<=rows;i++)

				{

					//leading space

					for(int j=i;j<rows;j++)

					{

						System.out.print(" ");

					}

					//print *

					for(int k=1;k<=(2*i-1);k++)

					{

						System.out.print("*");

					}	

					System.out.println();

				}

				

				//bottom half of the diamond

						for(int i=rows-1;i>=2;i--)

						{

							//leading space

							for(int j=rows;j>i;j--)

							{

								System.out.print(" ");

							}

							//print *

							for(int k=1;k<=(2*i-1);k++)

							{

								System.out.print("*");

							}	

							System.out.println();

						}


	}

}
