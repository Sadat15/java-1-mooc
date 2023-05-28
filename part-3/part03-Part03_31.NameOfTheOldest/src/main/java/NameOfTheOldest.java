
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldest = "";
        int oldestAge = -1;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            if (oldestAge < Integer.valueOf(input.split(",")[1])) {
                oldest = input.split(",")[0];
                oldestAge = Integer.valueOf(input.split(",")[1]);
            }
        }

        System.out.println("Name of oldest: " + oldest);
    }
}
