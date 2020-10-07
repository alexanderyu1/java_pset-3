import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = in.nextDouble();
        System.out.print("401(k)  : ");
        double taxPercent401K = in.nextDouble();
        System.out.print("Federal : ");
        double taxPercentFederal = in.nextDouble();
        System.out.print("State   : ");
        double taxPercentState = in.nextDouble();

        in.close();

        double taxPercent401KDecimal = taxPercent401K / 100;
        double taxPercentFederalDecimal = taxPercentFederal / 100;
        double taxPercentStateDecimal = taxPercentState / 100;

        double salaryAfter401k = (salary - (salary * taxPercent401KDecimal));
        double result = (salaryAfter401k - (salaryAfter401k * (taxPercentFederalDecimal + taxPercentStateDecimal))) / 24;

        System.out.printf("\n" + "$" + "%,.2f", result);
        System.out.println(".");


    }
}
