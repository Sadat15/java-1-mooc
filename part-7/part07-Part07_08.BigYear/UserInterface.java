import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private BirdsDatabase birds;

  public UserInterface(Scanner scanner, BirdsDatabase birds) {
    this.scanner = scanner;
    this.birds = birds;
  }

  public void start() {
    while (true) {
      System.err.println("?");
      String command = scanner.nextLine();
      if (command.equals("Add")) {
        System.out.println("Name: ");
        String firstInput = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String secondInput = scanner.nextLine();
        birds.addBird(new Bird(firstInput, secondInput));
      } else if (command.equals("Observation")) {
        System.out.println("Bird? ");
        String input = scanner.nextLine();
        birds.incrementObservations(input);
      } else if (command.equals("All")) {
        birds.allBirds();
      } else if (command.equals("One")) {
        System.out.println("Bird? ");
        String input = scanner.nextLine();
        birds.oneBird(input);
      } else if (command.equals("Quit")) {
        break;
      }

    }
  }
}
