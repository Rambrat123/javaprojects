package Pepcoding_Getting_started;

import java.util.Scanner;

public class Fabnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc =new Scanner(System.in);
   System.out.println("How many no of fabnocci series you want :-");
   int n=sc.nextInt();
   System.out.println("Enter first two numbers");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c;
    
   for(int i=1;i<=n;i++)
   {
	   System.out.print(a+" ");
	   c=a+b;
	   a=b;
	   b=c;
   }
   
	}

}
