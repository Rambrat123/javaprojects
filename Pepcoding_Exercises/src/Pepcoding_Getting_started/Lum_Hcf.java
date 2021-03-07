package Pepcoding_Getting_started;

import java.util.Scanner;

public class Lum_Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();//36
		int n2=sc.nextInt();//24
		int o1=n1;
		int o2=n2;
		int r,gcd;
		while(n1%n2!=0)
		{
		 r=n1%n2;
			
			n1=n2;
			n2=r;
		}
		gcd=n2;
		int lcm=(o1*o2)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);

	}

}
