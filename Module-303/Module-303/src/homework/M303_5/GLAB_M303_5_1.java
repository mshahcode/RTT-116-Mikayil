package homework.M303_5;

class loopdemoone {
    public static void main(String[] args) {
        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }
    }
}


class TestLoop {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1000;
        // for loop
        for (int i = 1; i <= n; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}

public class GLAB_M303_5_1 {
}
