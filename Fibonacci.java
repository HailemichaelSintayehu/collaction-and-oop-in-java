public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this value to the desired number in the sequence.
        // fn = fn-1 + fn-2
        // f0 = 0
        // f1 = 1


        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
