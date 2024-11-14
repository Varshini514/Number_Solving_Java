package NumberSolving;

import java.util.Scanner;

public class Sum_of_squares {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		sc.close();
		
		for(int i=1; i<=num; i++) {
			int a = num % 10;
			result = result + (i * i);
			num = num % 10;
		}
		System.out.println("Sum of Squares are:"+ result);
	}

}

