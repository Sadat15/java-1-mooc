import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private RecipeBook book;

  public UserInterface(Scanner scanner, RecipeBook book) {
    this.scanner = scanner;
    this.book = book;
  }

  public void Start() {
    System.out.print("File to read: ");
    String fileName = scanner.nextLine();
    book.initialise(fileName);

    System.out.println("");
    System.out.println("Commands:");
    System.out.println("list - lists the recipes");
    System.out.println("stop - stops the program");
    System.out.println("find name - searches recipes by name");
    System.err.println("find cooking time - searches recipes by cooking time");
    System.out.println("find ingredient - searches recipes by ingredient");
    System.out.println("");

    while (true) {
      System.out.print("Enter command: ");
      String command = scanner.nextLine();
      // System.out.println("");

      if (command.equals("list")) {
        System.out.println("Recipes:");
        book.readAndListRecipes();
      } else if (command.equals("find name")) {
        System.out.print("Searched word: ");
        String word = scanner.nextLine();
        System.out.println("\nRecipes:");
        book.search(word);
      } else if (command.equals("find cooking time")) {
        System.out.print("Max cooking time: ");
        int maxCookingTime = Integer.valueOf(scanner.nextLine());
        System.out.println("\nRecipes:");
        book.getMaxCookingTime(maxCookingTime);
      } else if (command.equals("find ingredient")) {
        System.out.print("Ingredient: ");
        String word = scanner.nextLine();
        System.out.println("\nRecipes:");
        book.getRecipesWithIngredient(word);
      } else if (command.equals("stop")) {
        break;
      }
    }
  }
}
