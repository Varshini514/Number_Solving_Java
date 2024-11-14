package NumberSolving;

import java.util.Scanner;

public class Prime_number {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; 
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
