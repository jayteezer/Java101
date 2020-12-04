
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = 1;
        System.out.println("Give a number:");
        int factorial = Integer.valueOf(scanner.nextLine());
        int product = 1;
        
        for(int i = start; i <= factorial; i++) {
            product *= i;
        }
        System.out.println("Factorial: " + product);
    }
}
