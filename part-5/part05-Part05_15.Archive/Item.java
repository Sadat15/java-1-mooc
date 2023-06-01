public class Item {
  private String identifier;
  private String name;

  public Item(String identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  public String getId() {
    return this.identifier;
  }

  public String getName() {
    return this.name;
  }

  public boolean equals(Object item) {
    if (this == item) {
      return true;
    }

    if (!(item instanceof Item)) {
      return false;
    }

    Item compared = (Item) item;

    return this.identifier.equals(compared.identifier);
  }

  public String toString() {
    return this.identifier + ": " + this.name;
  }

}
