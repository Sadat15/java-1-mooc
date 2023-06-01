
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String input2 = scanner.nextLine();
            if (input2.isEmpty()) {
                break;
            }

            Item item = new Item(input, input2);

            if (items.contains(item)) {
                continue;
            }

            items.add(item);
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
