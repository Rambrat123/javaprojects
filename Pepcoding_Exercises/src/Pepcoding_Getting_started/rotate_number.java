package Pepcoding_Getting_started;

import java.util.Scanner;

public class rotate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int nod=0;
		int temp=n;
		while(temp>0)
		{
			temp=temp/10;
			nod++;
		}
		k=k%nod;// it solve the problem of large rotations
		if(k<0)
			k=k+nod;
		
		int div=1;
		int mul=1;
		for(int i=1;i<=nod;i++)
		{
			if(i<=k)
				div=div*10;
			else
				mul=mul*10;
		}
		int r=n%div;
		int q=n/div;
		int rotate=r*mul+q;
		System.out.println(rotate);

	}
 //new git branch rambrat
}
