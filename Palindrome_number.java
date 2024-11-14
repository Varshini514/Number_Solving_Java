package NumberSolving;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int rev = 0;
		sc.close();
		
		while(num!=0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		
		if(rev == original) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
