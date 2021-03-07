package Pepcoding_Getting_started;

import java.util.Scanner;

public class Inversing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 21345
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int inv=0;
		int op=1;
		
		while(n!=0)
		{
			int od=n%10;
			int id=op;
			int ip=od;
			inv=inv+id*(int)Math.pow(10, ip-1);
			n=n/10;
			op++;
		}
		System.out.println(inv);

	}

}
