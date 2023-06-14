
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String listOfElements = "";
        String sentence = "";

        for (int i = 0; i < elements.size(); i++) {
            if (i == elements.size() - 1) {
                listOfElements += elements.get(i);
            } else {
                listOfElements += elements.get(i) + "\n";
            }
        }

        if (elements.size() == 1) {
            sentence = "The collection " + this.name + " has " + elements.size() + " element:\n";
        } else {
            sentence = "The collection " + this.name + " has " + elements.size() + " elements:\n";
        }

        return sentence + listOfElements;
    }

}
