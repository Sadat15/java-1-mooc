
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String str = "";

        for (int i = 0; i < number; i++) {
            str += "*";
        }

        System.out.println(str);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String str = "";

        for (int i = 0; i < number; i++) {
            str += " ";
        }

        System.out.print(str);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int i = size;
        int j = 1;

        while (j <= size) {
            printSpaces(i - 1);
            printStars(j);
            i--;
            j++;

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = height;
        int j = 1;

        while (i > 0) {
            printSpaces(i - 1);
            printStars(j);
            i--;
            j += 2;
        }

        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
