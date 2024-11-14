package NumberSolving;

import java.util.Scanner;

public class GCD_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		int gcd = 1;
		sc.close();
		
		for(int i=1; i<=Math.max(num1, num2); i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
		}
		System.out.println("The GCD of two numbers are:" + gcd);
	}			
	}
