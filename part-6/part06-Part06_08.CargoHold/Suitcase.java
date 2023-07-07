import java.util.ArrayList;

public class Suitcase {
  private int maxWeight;
  private int currentWeight = 0;
  private ArrayList<Item> items = new ArrayList<>();

  public Suitcase(int maxWeight) {
    this.maxWeight = maxWeight;
  }

  public void addItem(Item item) {
    if (currentWeight + item.getWeight() <= maxWeight) {
      items.add(item);
      currentWeight += item.getWeight();
    }
  }

  public String toString() {
    if (items.isEmpty()) {
      return "no items (0 kg)";
    } else if (items.size() == 1) {
      return "1 item(" + currentWeight + " kg)";
    }

    return items.size() + " items (" + currentWeight + " kg)";
  }

  public void printItems() {
    for (Item item : items) {
      System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
    }
  }

  public int totalWeight() {
    return currentWeight;
  }

  public Item heaviestItem() {
    if (items.isEmpty()) {
      return null;
    }

    Item heaviest = items.get(0);
    for (int i = 1; i < items.size(); i++) {
      if (items.get(i).getWeight() > heaviest.getWeight()) {
        heaviest = items.get(i);
      }
    }

    return heaviest;
  }

}
