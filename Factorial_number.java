package NumberSolving;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner sc = new Scanner(System.in);
		sc.close();
		int num = sc.nextInt();
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of given number is : "+fact);
	}

}
