import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Amount : ");
        double amount = in.nextDouble();

        in.close();

        double amountInInt = amount * 100;
        int quarters = (int) (amountInInt / 25);
        int dimes = (int) (amountInInt % 25) / 10;
        int nickels = (int) ((amountInInt % 25) % 10) / 5;
        int pennies = (int) ((amountInInt % 25) % 10) % 5;

        System.out.print("\n" + "Quarters : " + quarters);
        System.out.print("\n" + "Dimes    : " + dimes);
        System.out.print("\n" + "Nickels  : " + nickels);
        System.out.print("\n" + "Pennies  : " + pennies);
    }
}
