package homework.M303_2;

class AllTasks {

    static void task1() {
        // Case 1: x = 2
        int x = 2;
        System.out.println("Task 1a - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after left shift: 4, Binary: 100
        x = x << 1;
        System.out.println("x (after left shift): " + x + " -> Binary: " + Integer.toBinaryString(x));

        // Case 2: x = 9
        x = 9;
        System.out.println("\nTask 1b - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after left shift: 18, Binary: 10010
        x = x << 1;
        System.out.println("x (after left shift): " + x + " -> Binary: " + Integer.toBinaryString(x));

        // Case 3: x = 17
        x = 17;
        System.out.println("\nTask 1c - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after left shift: 34, Binary: 100010
        x = x << 1;
        System.out.println("x (after left shift): " + x + " -> Binary: " + Integer.toBinaryString(x));

        // Case 4: x = 88
        x = 88;
        System.out.println("\nTask 1d - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after left shift: 176, Binary: 10110000
        x = x << 1;
        System.out.println("x (after left shift): " + x + " -> Binary: " + Integer.toBinaryString(x));
    }

    static void task2() {
        // Case 1: x = 150
        int x = 150;
        System.out.println("\nTask 2a - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after right shift: 37, Binary: 100101
        x = x >> 2;
        System.out.println("x (after right shift): " + x + " -> Binary: " + Integer.toBinaryString(x));

        // Case 2: x = 225
        x = 225;
        System.out.println("\nTask 2b - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after right shift: 56, Binary: 111000
        x = x >> 2;
        System.out.println("x (after right shift): " + x + " -> Binary: " + Integer.toBinaryString(x));

        // Case 3: x = 1555
        x = 1555;
        System.out.println("\nTask 2c - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after right shift: 388, Binary: 110000100
        x = x >> 2;
        System.out.println("x (after right shift): " + x + " -> Binary: " + Integer.toBinaryString(x));

        // Case 4: x = 32456
        x = 32456;
        System.out.println("\nTask 2d - x (original): " + x + " -> Binary: " + Integer.toBinaryString(x));
        // Predicted decimal value after right shift: 8114, Binary: 1111110010010
        x = x >> 2;
        System.out.println("x (after right shift): " + x + " -> Binary: " + Integer.toBinaryString(x));
    }

    static void task3() {
        int x = 7;
        int y = 17;
        // Predicted result: 1, because 7 = 0111 and 17 = 10001, the AND will give 0001.
        int z = x & y;
        System.out.println("\nTask 3 - Result of x & y: " + z + " -> Binary: " + Integer.toBinaryString(z));
    }

    static void task4() {
        int x = 7;
        int y = 17;
        // Predicted result: 23, because 7 = 0111 and 17 = 10001, the OR will give 10111.
        int z = x | y;
        System.out.println("\nTask 4 - Result of x | y: " + z + " -> Binary: " + Integer.toBinaryString(z));
    }

    static void task5() {
        int x = 10;
        System.out.println("\nTask 5 - x before increment: " + x);
        x++;  // Postfix increment
        System.out.println("x after increment: " + x);
    }

    static void task6() {
        int x = 5;
        System.out.println("\nTask 6 - x = " + x);

        // Method 1: Using ++
        x++;
        System.out.println("After x++, x = " + x);

        // Method 2: Using +=
        x += 1;
        System.out.println("After x += 1, x = " + x);

        // Method 3: Using x = x + 1
        x = x + 1;
        System.out.println("After x = x + 1, x = " + x);
    }

    static void task7() {
        int x = 5;
        int y = 8;

        // Using prefix increment
        int sum = ++x + y;
        System.out.println("\nTask 7 - Sum with prefix increment (++x): " + sum);  // Result should be 14

        // Reset x for postfix example
        x = 5;

        // Using postfix increment
        sum = x++ + y;
        System.out.println("Sum with postfix increment (x++): " + sum);  // Result should be 13
        System.out.println("x after postfix increment: " + x);  // x should now be 6
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
}



public class PA_303_2_3 {

}
