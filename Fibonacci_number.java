package NumberSolving;

import java.util.Scanner;

public class Fibonacci_number {

	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int a = 0;
		int b = 1;
		int c = 0;
		
		if (num == 0) {
            System.out.println("The result is: " + a); 
            
        } else if (num == 1) {
            System.out.println("The result is: " + b); 
            
        }

		
		for(int i=2; i<=num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		System.out.println("The result is:" +c);

	}

}
