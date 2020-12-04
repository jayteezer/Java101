import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Customer number: ");
        int y = Integer.valueOf(x.nextLine());

        if (y >= 2000) {
            System.out.println("Gets a larger gift card!");
        } else if (y == 1025) {
            System.out.println("Gets a gift card!");
        } else {
            System.out.println("Gets nothing.");
        }
    }
}
