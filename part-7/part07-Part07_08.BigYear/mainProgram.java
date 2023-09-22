
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdsDatabase birds = new BirdsDatabase();
        UserInterface ui = new UserInterface(scan, birds);
        ui.start();
    }

}
