package NumberSolving;

import java.util.Scanner;

public class Sum_of_numbers {

	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first " + num + " natural numbers are: " + sum);
	}

}
