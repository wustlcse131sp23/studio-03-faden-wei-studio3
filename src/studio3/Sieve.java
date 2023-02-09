package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		
		int arr[] = new int[n+1];
		
	
		for (int i=0; i <= n; i++)
		{
			arr[i] = i;
		}
		System.out.println();
		for (int j=2; j <= n; j++)
		{
			for (int i = (2 * j); i <= n; i += j)
			{
				arr[i] = -1;
			}
		}
		int count = 0;
		for (int i=2; i <= n; i++)
		{
			if (arr[i] != -1)
			{
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println(count);
		
	}

}
