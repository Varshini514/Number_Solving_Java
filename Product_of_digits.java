package NumberSolving;

import java.util.Scanner;

public class Product_of_digits {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int product = 1;
		sc.close();
		
		while(num!=0) {
			int lastnum = num % 10;
			product = product * lastnum;
			num = num / 10;
		}
		System.out.println("The product of digits are:"+ product);
		
	}

}
