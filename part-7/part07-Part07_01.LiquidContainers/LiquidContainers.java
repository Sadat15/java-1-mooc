
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("First " + first + "/100");
            System.out.print("\nSecond " + second + "/100\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            if (parts[0].equals("add") && Integer.valueOf(parts[1]) > 0) {
                if (Integer.valueOf(parts[1]) > 100) {
                    first = 100;
                } else if (Integer.valueOf(parts[1]) + first <= 100) {
                    first += Integer.valueOf(parts[1]);
                } else if (Integer.valueOf(parts[1]) + first > 100) {
                    first = 100;
                }
            } else if (parts[0].equals("move") && Integer.valueOf(parts[1]) > 0 && first > 0) {
                if (Integer.valueOf(parts[1]) + second > 100) {
                    first = 0;
                    second = 100;
                } else if (Integer.valueOf(parts[1]) > first) {
                    second += first;
                    first = 0;
                } else if (Integer.valueOf(parts[1]) < first) {
                    first -= Integer.valueOf(parts[1]);
                    second += Integer.valueOf(parts[1]);
                } else if (Integer.valueOf(parts[1]) == first) {
                    first = 0;
                    second += Integer.valueOf(parts[1]);
                }
            } else if (parts[0].equals("remove") && Integer.valueOf(parts[1]) > 0) {
                if (Integer.valueOf(parts[1]) > second) {
                    second = 0;
                } else {
                    second -= Integer.valueOf(parts[1]);
                }

            }

            System.out.println("");
        }
    }

}
