public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 1;
        while (i <= number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int height = 0;
        while (height < size) {
            printSpaces(size - height - 1);
            height++;
            printStars(height);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int heightCounter = 0;
        int starsCounter = 0;
        
        printSpaces(height - heightCounter - 1);  // 10 - 0 - 1 = 9, prints 9 spaces
        printStars(starsCounter + 1);  // 0 + 1, prints one *
        heightCounter++;
        starsCounter++;
        
        while (heightCounter < height) {  // heightCounter = 1
            printSpaces(height - heightCounter - 1);  // 10 - 1 - 1 = 8, prints 8 spaces
            printStars(starsCounter += 2);  // 1 + 1 = 2 + 1 = starsCounter should be 3
            //printSpaces(height - heightCounter - 1);
            heightCounter++;
        }
        
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printTriangle(4);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
    }
}
