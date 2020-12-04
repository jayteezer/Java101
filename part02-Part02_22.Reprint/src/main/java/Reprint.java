
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How many times?");
        int times = Integer.valueOf(reader.nextLine());
        for(int i = 1; i <= times; i++) {
            printText();
        }
    }
    
    public static void printText() {
        // Write some code in here
        System.out.print("In a hole in the ground there lived a method\n");
    }
}