import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount : ");
        double amount = in.nextDouble();

        in.close();

        double amountConvertedToInteger = amount * 100;
        int quarters = (int) (amountConvertedToInteger / 25);
        int dimes = (int) (amountConvertedToInteger % 25) / 10;
        int nickels = (int) ((amountConvertedToInteger % 25) % 10) / 5;
        int pennies = (int) ((amountConvertedToInteger % 25) % 10) % 5;

        System.out.print("\n" + "Quarters : " + quarters);
        System.out.print("\n" + "Dimes    : " + dimes);
        System.out.print("\n" + "Nickels  : " + nickels);
        System.out.println("\n" + "Pennies  : " + pennies);
    }
}
