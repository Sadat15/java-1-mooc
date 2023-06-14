import java.util.ArrayList;

public class Package {
  private ArrayList<Gift> total = new ArrayList<>();

  public void addGift(Gift gift) {
    total.add(gift);
  }

  public int totalWeight() {
    int sum = 0;

    for (Gift gift : total) {
      sum += gift.getWeight();
    }

    return sum;
  }
}
