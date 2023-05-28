
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> people = new ArrayList<Integer>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            people.add(Integer.valueOf(input.split(",")[1]));
        }

        int oldest = people.get(0);

        for (int i = 1; i < people.size(); i++) {
            if (oldest < people.get(i)) {
                oldest = people.get(i);
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
