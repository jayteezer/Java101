import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 1;
        int count = -1;
        int even = 0;
        int odd = 0;
        double average = 0;
        
        System.out.println("Give numbers:");
        while (true) {
            int givenNum = Integer.valueOf(scanner.nextLine());
            sum += givenNum;
            count++;
            if (givenNum == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (givenNum % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }     
        average = (double) sum / (double) count;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}