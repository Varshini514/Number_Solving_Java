package NumberSolving;

import java.util.Scanner;

public class Sum_of_primeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		sc.close();
		
		for(int i = num1; i <= num2; i++) {
			if(i % 2 != 0) {
				sum  = cnt + i;
			}
		}
		System.out.println("The sum of prime numbers from " + num1 + " to " + num2 + " are: " + sum);
	}

}
