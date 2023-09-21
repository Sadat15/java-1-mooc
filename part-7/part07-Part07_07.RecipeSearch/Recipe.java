import java.util.ArrayList;

public class Recipe {
  private String recipeTitle;
  private int cookingTime;
  private ArrayList<String> ingredients;

  public Recipe(String recipeTitle, int cookingTime, ArrayList<String> ingredients) {
    this.recipeTitle = recipeTitle;
    this.cookingTime = cookingTime;
    this.ingredients = ingredients;
  }

  public String getTitle() {
    return recipeTitle;
  }

  public int getCookingTime() {
    return cookingTime;
  }

  public ArrayList<String> getIngredients() {
    return ingredients;
  }

}
