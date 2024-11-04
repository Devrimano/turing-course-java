import java.util.Scanner;

public class fibo {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input n (0 <= n <= 30): ");
        int n = sc.nextInt();


        if (n < 0 || n > 30) {
            System.out.println("over limit.");
        } else {
            System.out.println("Fibonacci(" + n + ") = " + fib(n));
        }

    }
}
