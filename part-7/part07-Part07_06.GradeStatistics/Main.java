
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        Points points = new Points();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (0 <= input && input <= 100) {
                points.addToPointsList(input);
            }

            if (input == -1) {
                break;
            }
        }

        System.out.println("Point average (all): " + points.getPointsAverage());
        if (Double.isNaN(points.getPassingPointsAverage())) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + points.getPassingPointsAverage());
        }
        System.out.println("Pass percentage: " + points.getPassPercentage());
        System.out.println("Grade distribution");
        points.getGradeDistribution();
    }
}
