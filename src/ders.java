import java.util.Scanner;
import java.math.BigInteger;
//
public class ders {
    public static long CalculateTriangle(int n) {
        if (n <100 || n>Math.pow(10,9)){
            return -1;
        }
        return (3L * n * n) / 2 + (5L * n) / 2 + 1;
    }

    public static BigInteger factorial(int n) {
        BigInteger t = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            t = t.multiply(BigInteger.valueOf(i));
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(CalculateTriangle(n));
    }
}
