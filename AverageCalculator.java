import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        String[] subjects = new String[5];
        System.out.println("Enter the names and marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + " name: ");
            subjects[i] = scanner.nextLine();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        System.out.printf("The average of the marks is: %.2f%n", average);
        scanner.close();
    }
}
