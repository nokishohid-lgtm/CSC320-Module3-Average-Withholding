import java.util.Scanner;

/**
 * Calculates weekly tax withholding based on a customer's weekly income.
 *
 * Course: CSC320 - Programming 1
 * Module: Understanding the Decision Control Structure
 */
public class AverageWithholding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weekly income: $");
        double weeklyIncome = scanner.nextDouble();

        double taxRate;

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double averageWithholding = weeklyIncome * taxRate;

        System.out.printf("%nWeekly income: $%.2f%n", weeklyIncome);
        System.out.printf("Tax rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Average weekly tax withholding: $%.2f%n", averageWithholding);

        scanner.close();
    }
}
