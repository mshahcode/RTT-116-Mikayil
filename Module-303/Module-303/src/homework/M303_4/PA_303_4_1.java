package homework.M303_4;

import java.util.Scanner;


public class PA_303_4_1 {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    static void task1() {
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        x = 15;
    }

    static void task2() {
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
        x = 15;
    }

    static void task3() {
        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >= 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
        x = 50;
    }

    static void task4() {
        int x = 15;
        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        x = 5;
    }

    static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    }

    static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filing status (Single, Married Filing Jointly, Married Filing Separately, Head of Household): ");
        String status = scanner.nextLine();
        System.out.print("Enter income: ");
        double income = scanner.nextDouble();
        double tax = 0;

        switch (status) {
            case "Single":
                if (income <= 8350) {
                    tax = income * 0.10;
                } else if (income <= 33950) {
                    tax = 835 + (income - 8350) * 0.15;
                } else if (income <= 82250) {
                    tax = 4675 + (income - 33950) * 0.25;
                } else {
                    tax = 16725 + (income - 82250) * 0.28;
                }
                break;
            case "Married Filing Jointly":
                if (income <= 16700) {
                    tax = income * 0.10;
                } else if (income <= 67900) {
                    tax = 1670 + (income - 16700) * 0.15;
                } else if (income <= 137050) {
                    tax = 9525 + (income - 67900) * 0.25;
                } else {
                    tax = 24025 + (income - 137050) * 0.28;
                }
                break;
            case "Married Filing Separately":
                if (income <= 8350) {
                    tax = income * 0.10;
                } else if (income <= 33950) {
                    tax = 835 + (income - 8350) * 0.15;
                } else if (income <= 68525) {
                    tax = 4675 + (income - 33950) * 0.25;
                } else {
                    tax = 16725 + (income - 68525) * 0.28;
                }
                break;
            case "Head of Household":
                if (income <= 11950) {
                    tax = income * 0.10;
                } else if (income <= 45500) {
                    tax = 1195 + (income - 11950) * 0.15;
                } else if (income <= 117450) {
                    tax = 6445 + (income - 45500) * 0.25;
                } else {
                    tax = 19645 + (income - 117450) * 0.28;
                }
                break;
            default:
                System.out.println("Invalid filing status");
                return;
        }
        System.out.printf("Tax owed: $%.2f%n", tax);
    }
}

