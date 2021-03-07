package Pepcoding_Getting_started;

import java.util.Scanner;

public class Prime_number_range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,j;
		for(i=n1;i<=n2;i++)
		{   int cnt=0;
		     for(j=1;j<=i;j++)
		     {
		    	 if(i%j==0)
		    		 cnt++;
		     }
		     if(i==1)
		    	 continue;
		     else if(cnt==2)
			System.out.println(i);
		}
		
/*		int i;
		for(i=n1;i<=n2;i++)
		{   	int cnt=0;
			for(int j=1;i<=i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			
			if(cnt==2)
				System.out.println(i);
		}*/
		
	}
	

}
