import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Wage      : ");
        double wage = in.nextDouble();
        System.out.print("Monday    : ");
        double monday = in.nextDouble();
        System.out.print("Tuesday   : ");
        double tuesday = in.nextDouble();
        System.out.print("Wednesday : ");
        double wednesday = in.nextDouble();
        System.out.print("Thursday  : ");
        double thursday = in.nextDouble();
        System.out.print("Friday    : ");
        double friday = in.nextDouble();
        System.out.print("Saturday  : ");
        double saturday = in.nextDouble();
        System.out.print("Sunday    : ");
        double sunday = in.nextDouble();

        in.close();

        double hours = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
        double result = hours * wage;

        System.out.printf("\n" + "$" + "%,.2f", result);
        System.out.println(".");
    }
}
