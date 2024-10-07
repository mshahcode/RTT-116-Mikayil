package homework.M303_2;

class Task1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("The sum of the integers is: " + sum);
    }
}

class Task2 {
    public static void main(String[] args) {
        double num1 = 12.5;
        double num2 = 7.5;
        double sum = num1 + num2;
        System.out.println("The sum of the doubles is: " + sum);
    }
}

class Task3 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 15.5;
        double sum = num1 + num2;  // The sum must be a double
        System.out.println("The sum of the integer and double is: " + sum);
    }
}

class Task4 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println("The result of the division (integers) is: " + result);

        // Now change the larger number to a decimal
        double num3 = 20.0;  // Now it's a double
        double resultDouble = num3 / num2;
        System.out.println("The result of the division (double) is: " + resultDouble);
    }
}


class Task5 {
    public static void main(String[] args) {
        double num1 = 15.5;
        double num2 = 2.5;
        double result = num1 / num2;
        System.out.println("The result of the division (doubles) is: " + result);

        // Now cast the result to an integer
        int resultInt = (int) result;
        System.out.println("The result of the division cast to int is: " + resultInt);
    }
}

class Task6 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("The result without casting is: " + q);

        // Now cast y to double
        double qDouble = (double) y / x;
        System.out.println("The result after casting y to double is: " + qDouble);
    }
}


class Task7 {
    public static void main(String[] args) {
        final double PI = 3.14159;  // Named constant
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}

class Task8 {
    public static void main(String[] args) {
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.50;
        double espressoPrice = 1.75;

        int coffeeQty = 3;
        int cappuccinoQty = 4;
        int espressoQty = 2;

        double subtotal = (coffeePrice * coffeeQty) + (cappuccinoPrice * cappuccinoQty) + (espressoPrice * espressoQty);
        final double SALES_TAX = 0.09;  // 9% sales tax
        double totalSale = subtotal + (subtotal * SALES_TAX);

        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Total Sale (including tax): %.2f\n", totalSale);
    }
}


public class PA_303_2_1 {
}
