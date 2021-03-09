package Pepcoding_Getting_started;

import java.util.Scanner;

public class pythagoras_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int n;
		
		if(a>b && a>c)
			n=a;
		else if(b>a && b>c)
			n=b;
		else
			n=c;
		int t=n*n;
		int a1=a*a;
		int b1=b*b;
		int c1=c*c;
		
		System.out.println((t==a1+b1 || t==b1+c1 || t==c1+a1));
		
		
			

	}

}
