import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height : ");
        double heightInInches = in.nextDouble();
        System.out.print("Width  : ");
        double widthInInches = in.nextDouble();

        in.close();

        double widthInMillimeters = widthInInches * 2.54 * 10;
        double heightInMillimeters = heightInInches * 2.54 * 10;

        double result = widthInMillimeters * heightInMillimeters;

        System.out.printf("\n" + "%,.2f", result);
        System.out.println(" square millimeters.");
    }
}
