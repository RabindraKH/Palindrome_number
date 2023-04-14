package test_3;

import java.util.Scanner;

//Palindrome number
public class A {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int num1=num,temp=0;
		while(num>0) {
			 temp=(temp*10)+(num%10);
			 num=num/10;
		}
		if(temp==num1) {
			System.out.println("It is a Palindrome number");
		}else {
			System.out.println("It is not a Pallindrome number");
		}
		
	}
}
