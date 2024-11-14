package NumberSolving;

import java.util.Scanner;

public class Number_reverse {
	
	public static void main(String args[]) {
		
			System.out.println("Enter the number:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt(); 
			sc.close();
			String rev = " ";
				while(num != 0) {
					rev = rev + num % 10;
					num = num / 10;	
	}
			System.out.println("The reversed number is: " + rev);
	}

}
