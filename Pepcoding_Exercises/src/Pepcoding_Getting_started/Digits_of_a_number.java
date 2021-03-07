package Pepcoding_Getting_started;

import java.util.Scanner;

public class Digits_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		String s=String.valueOf(n);
		//System.out.println(s+100);
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
