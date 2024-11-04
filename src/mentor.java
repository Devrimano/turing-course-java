import java.util.Scanner;

public class mentor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(a); i++) {
             if  (a % i == 0){
                 isPrime = false;
                 break;

             }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else
            System.out.println( "not prime");
    }
}
