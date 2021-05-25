import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInputs = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            numInputs++;
            sum = sum + number;

        }
//        System.out.println("Number of numbers: " + numInputs);
//        System.out.println("Sum of the numbers: " + sum);
        double average = (double) sum / numInputs;
        System.out.println("Average of the numbers: " + average);

    }
}