import java.util.ArrayList;

public class Stack {
  private ArrayList<String> strings = new ArrayList<>();

  public boolean isEmpty() {
    if (strings.isEmpty() == true) {
      return true;
    } else {
      return false;
    }
  }

  public void add(String value) {
    strings.add(value);
  }

  public ArrayList<String> values() {
    return strings;
  }

  public String take() {
    String last = strings.get(strings.size() - 1);
    strings.remove(strings.size() - 1);
    return last;
  }
}
