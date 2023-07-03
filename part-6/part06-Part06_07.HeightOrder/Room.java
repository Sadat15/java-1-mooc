import java.util.ArrayList;

public class Room {
  ArrayList<Person> persons = new ArrayList<>();

  public void add(Person person) {
    persons.add(person);
  }

  public boolean isEmpty() {
    if (persons.isEmpty()) {
      return true;
    }

    return false;
  }

  public ArrayList<Person> getPersons() {
    return persons;
  }

  public Person shortest() {
    if (this.isEmpty()) {
      return null;
    }

    Person shortest = persons.get(0);

    for (int i = 1; i < persons.size(); i++) {
      if (persons.get(i).getHeight() < shortest.getHeight()) {
        shortest = persons.get(i);
      }
    }
    return shortest;
  }

  public Person take() {
    Person shortest = this.shortest();
    persons.remove(shortest);
    return shortest;
  }

}
