
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(file));) {
            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();
                System.out.println(format(line));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static String format(String input) {
        String name = input.split(",")[0];
        String age = input.split(",")[1];
        age = ", age: " + age + " years";
        return name + age;
    }

}
