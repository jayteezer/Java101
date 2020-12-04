import java.util.Scanner;
import java.lang.Math;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }
    
    /*public static void divisibleByThreeInRange(int beginning, int end) {
        if (beginning % 3 == 0) {
            for (int i = beginning; i <= end; i += 3) {
                System.out.println(i);
            }
        } else {
            double nextNum;
            nextNum = 3 * (Math.ceil((double)beginning / (double)3));
            for (double i = nextNum; i <= end; i += 3) {
                System.out.println((int)i);
            }
        }
       
    }*/
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
            beginning += 1;
        }
    }

}
