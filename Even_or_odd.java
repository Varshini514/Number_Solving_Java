package NumberSolving;

import java.util.Scanner;

public class Even_or_odd {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num % 2 == 0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}
	}

}
