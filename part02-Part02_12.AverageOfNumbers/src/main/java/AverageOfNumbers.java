
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double count = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            double average = 0;
            
            if (num != 0) {
                count = count + 1;
                sum += num;
            }
            
            if (num == 0) {
                average = (sum / count);
                System.out.println("Average of the numbers: " + average);
                break;
            }
        }
    }
}
