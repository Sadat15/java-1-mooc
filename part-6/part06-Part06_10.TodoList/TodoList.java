import java.util.ArrayList;

public class TodoList {
  private ArrayList<String> taskArrayList;

  public TodoList() {
    this.taskArrayList = new ArrayList<>();
  }

  public void add(String task) {
    taskArrayList.add(task);
  }

  public void print() {
    for (int i = 0; i < this.taskArrayList.size(); i++) {
      System.out.println(i + 1 + ": " + taskArrayList.get(i));
    }
  }

  public void remove(int number) {
    this.taskArrayList.remove(number - 1);
  }
}
