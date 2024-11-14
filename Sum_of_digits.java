package NumberSolving;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int sum = 0;
		sc.close();
			while(a != 0) {
				sum = sum + a % 10;
				a = a / 10;	
			}
		System.out.println("Sum of digits: " + sum);

	}

}
