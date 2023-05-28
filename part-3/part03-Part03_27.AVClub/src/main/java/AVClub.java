
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.length() == 0) {
                return;
            }

            String[] inputs = input.split(" ");

            for (int i = 0; i < inputs.length; i++) {
                if (inputs[i].contains("av")) {
                    System.out.println(inputs[i]);
                }
            }
        }

    }
}
