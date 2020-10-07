import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double temperatureFahrenheit = in.nextDouble();

        in.close();

        double temperatureCelsius = (temperatureFahrenheit - 32) * (5/9f);
        double temperatureKelvin = ((temperatureFahrenheit - 32) * (5/9f)) + 273.15;

        System.out.printf("\n" + "Celsius : " + "%,.2f", temperatureCelsius);
        System.out.printf("\n" + "Kelvin  : " + "%,.2f", temperatureKelvin);
    }
}
