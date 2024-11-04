/*ctrl alt l kod
ctrl alt o import
seliqe
 */
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    switch  (n){
        case 1:
            System.out.println("input is 1");
            break;
        case 2:
            System.out.println("input is 2");
            break;
        case 3:
            System.out.println("input is 3");
            break;
        case 4:
            System.out.println("input is 4"); break;
        case 5:
        case 6:
            System.out.println( "input is 5 or 6");
            break;
        default:
            System.out.println("greater than 6");
    }
    }
}
