import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Salary  : ");
        double salary = in.nextDouble();
        System.out.print("401(k)  : ");
        double fourOhOneK = in.nextDouble();
        System.out.print("Federal : ");
        double federal = in.nextDouble();
        System.out.print("State   : ");
        double state = in.nextDouble();

        in.close();

        double fourOhOneKDecimal = fourOhOneK / 100;
        double federalDecimal = federal / 100;
        double stateDecimal = state / 100;

        double salaryAfter401k = (salary - (salary * fourOhOneKDecimal));
        double result = (salaryAfter401k - (salaryAfter401k * (federalDecimal + stateDecimal))) / 24;

        System.out.printf("\n" + "$" + "%,.2f", result);
        System.out.print(".");


    }
}
