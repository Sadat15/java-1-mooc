import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {
  private ArrayList<Recipe> recipes;

  public RecipeBook() {
    this.recipes = new ArrayList<Recipe>();
  }

  public void addRecipe(Recipe recipe) {
    recipes.add(recipe);
  }

  public void initialise(String fileName) {
    String file = "../../../" + fileName;
    ArrayList<String> lines = new ArrayList<>();

    try (Scanner scanner = new Scanner(Paths.get(file))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lines.add(line);
      }

      int counter = 0;

      String titleString = "";
      int cookingTime = 0;
      ArrayList<String> ingredients;

      for (int i = 0; i < lines.size(); i++) {
        if (counter == 0) {
          titleString = lines.get(i);
          cookingTime = Integer.valueOf(lines.get(i + 1));
          ingredients = new ArrayList<>();

          for (int j = i + 2; j < lines.size() && !lines.get(j).isEmpty(); j++) {
            ingredients.add(lines.get(j));
          }

          this.addRecipe(new Recipe(titleString, cookingTime, ingredients));
          titleString = "";
          cookingTime = 0;

          counter = 0;
        }
        counter++;

        if (i < lines.size() - 1 && lines.get(i).isEmpty()) {
          counter = 0;
        }
      }

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void readAndListRecipes() {
    for (Recipe recipe : recipes) {
      System.out.println(recipe.getTitle() + ", cooking time: " + recipe.getCookingTime());
    }
    System.out.println("");
  }

  public void search(String word) {
    for (Recipe recipe : recipes) {
      if (recipe.getTitle().contains(word)) {
        System.out.println(recipe.getTitle() + ", cooking time: " + recipe.getCookingTime());
      }
    }
    System.out.println("");
  }

  public void getMaxCookingTime(int time) {
    for (Recipe recipe : recipes) {
      if (recipe.getCookingTime() <= time) {
        System.out.println(recipe.getTitle() + ", cooking time: " + recipe.getCookingTime());
      }
    }
    System.out.println("");
  }

  public void getRecipesWithIngredient(String ingredient) {
    for (Recipe recipe : recipes) {
      if (recipe.getIngredients().contains(ingredient)) {
        System.out.println(recipe.getTitle() + ", cooking time: " + recipe.getCookingTime());
      }
    }
    System.out.println("");
  }

}
