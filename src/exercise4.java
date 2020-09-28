import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height : ");
        double heightInInches = in.nextDouble();
        System.out.print("Width  : ");
        double widthInInches = in.nextDouble();

        in.close();

        double widthInCentimeters = widthInInches * 2.54;
        double heightInCentimeters = heightInInches * 2.54;

        double result = 2 * widthInCentimeters + 2 * heightInCentimeters;

        System.out.printf("\n" + "%,.2f", result);
        System.out.print(" centimeters.");
    }
}
