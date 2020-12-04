import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double countOfPositives = 0;
        double countOfNegatives = 0;
        double sumOfPositives = 0;
        
        while (true) {
            double num = Double.valueOf(scanner.nextLine());
            double averageOfPositives;
            
            if (num > 0) {
                countOfPositives = countOfPositives + 1;
                sumOfPositives += num;
                //System.out.println("The count of positives is " + countOfPositives);
                //System.out.println("The sum of positives is " + sumOfPositives);
            }
            
            if (num < 0) {
                countOfNegatives = countOfNegatives + 1;
                //System.out.println("The count of negatives is: " + countOfNegatives);
            }
            
            if (num == 0) {
                if (countOfPositives == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    averageOfPositives = sumOfPositives / countOfPositives;
                    System.out.println(averageOfPositives);
                    break;
                }
            }
        }
    }
}