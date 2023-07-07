import java.util.ArrayList;

public class Hold {
  private int maxWeight;
  private int total;
  private ArrayList<Suitcase> suitcases = new ArrayList<>();

  public Hold(int maxWeight) {
    this.maxWeight = maxWeight;
    this.total = 0;
  }

  public void addSuitcase(Suitcase suitcase) {
    if (this.total + suitcase.totalWeight() <= maxWeight) {
      suitcases.add(suitcase);
      total += suitcase.totalWeight();
    }
  }

  public String toString() {
    return suitcases.size() + " suitcases(" + total + " kg)";
  }

  public void printItems() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printItems();
    }
  }

}
