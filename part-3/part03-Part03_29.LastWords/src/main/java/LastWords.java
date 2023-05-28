
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 0) {
                return;
            }

            System.out.println(input.split(" ")[input.split(" ").length - 1]);
        }
    }
}
