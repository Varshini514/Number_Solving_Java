package NumberSolving;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		sc.close();
		
		for(int i=1; i <= num/2; i++) {
			if(num % i == 0) { 
				sum = sum + i;
			}
		}
		
		if(sum == original) {
			System.out.println("It is a perfect number");
		}
		else {
			System.out.println("It is not a perfect number");
		}
	}

}
