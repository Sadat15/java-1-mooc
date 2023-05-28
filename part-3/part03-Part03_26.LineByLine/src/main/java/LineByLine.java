
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();

            if (str.length() == 0) {
                return;
            }

            String[] words = str.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }

    }
}
