package homework.M303_5;


import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        int size = 12;

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}


class GCDCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two positive integers
        System.out.print("Enter the first positive integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second positive integer: ");
        int n2 = input.nextInt();

        int gcd = 1; // Initial GCD is 1 (since 1 divides everything)
        int k = 2;   // Starting from 2 to find higher divisors

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        // Output the GCD
        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}

public class PA_303_5_1 {
}
