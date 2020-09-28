import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Students : ");
        int students = in.nextInt();
        System.out.print("Teachers : ");
        int teachers = in.nextInt();
        System.out.print("Capacity : ");
        int capacity = in.nextInt();

        in.close();

        int totalPeople = students + teachers;
        int buses = (totalPeople / capacity);
        int overflow = totalPeople % capacity;

        System.out.println("\n" + "Buses required      : " + buses);
        System.out.println("Overflow passengers : " + overflow);
    }
}
