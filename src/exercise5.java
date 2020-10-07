import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double homework1 = in.nextDouble();
        System.out.print("Homework 2 : ");
        double homework2 = in.nextDouble();
        System.out.print("Homework 3 : ");
        double homework3 = in.nextDouble();
        System.out.print("Quiz 1     : ");
        double quiz1 = in.nextDouble();
        System.out.print("Quiz 2     : ");
        double quiz2 = in.nextDouble();
        System.out.print("Test 1     : ");
        double test1 = in.nextDouble();

        in.close();

        double homeworkAverage = 0.15 * ((homework1 + homework2 + homework3) / 3);
        double quizAverage = 0.35 * ((quiz1 + quiz2) / 2);
        double testAverage = 0.50 * (test1);

        double result = homeworkAverage + quizAverage + testAverage;

        System.out.printf("\n" + "%.2f", result);
        System.out.print("%.");
    }
}
