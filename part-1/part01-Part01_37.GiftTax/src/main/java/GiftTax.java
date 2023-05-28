
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (5000 <= value && value < 25000) {
            System.out.println("Tax: " + (100 + (value - 5000) * 0.08));
        } else if (25000 <= value && value < 55000) {
            System.out.println("Tax: " + (1700 + (value - 25000) * 0.10));
        } else if (55000 <= value && value < 200000) {
            System.out.println("Tax: " + (4700 + (value - 55000) * 0.12));
        } else if (200000 <= value && value < 1000000) {
            System.out.println("Tax: " + (22100 + (value - 200000) * 0.15));
        } else if (1000000 <= value) {
            System.out.println("Tax: " + (142100 + (value - 1000000) * 0.17));
        }
    }
}
