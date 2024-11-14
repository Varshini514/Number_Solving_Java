package NumberSolving;

import java.util.Scanner;

public class LCM_number {

	public static void main(String[] args) {
		System.out.println("Enter the numbers :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
        int lcm = max;
        sc.close();
		
        while(lcm % num1 != 0 || lcm % num2 != 0) {
        	lcm = lcm + max;
        }
	System.out.println("The LCM of two numbers are:" + lcm);
	}
}

