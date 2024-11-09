import java.util.Scanner;

public class last {
    public static int smallestEvenMultiple(int x) {
        return (x % 2 == 0) ? x : (x * 2);
    }

    public static void main(String[] args) {
        System.out.println("input a number: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.close();

        int FinalAnswer = smallestEvenMultiple(t);
        System.out.println(FinalAnswer);
        System.out.println("NIGGA");

    }
}       
