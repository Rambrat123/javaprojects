package Pepcoding_Getting_started;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		while(n!=0)
		{
			n=n/10;
				cnt++;
			
		}
		System.out.println(cnt);

	}
 //comment
}
