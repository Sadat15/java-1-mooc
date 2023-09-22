import java.util.ArrayList;

public class BirdsDatabase {
  private ArrayList<Bird> birds;

  public BirdsDatabase() {
    this.birds = new ArrayList<>();
  }

  public void addBird(Bird bird) {
    birds.add(bird);
  }

  public void oneBird(String birdName) {
    for (Bird bird : birds) {
      if (bird.getName().equals(birdName)) {
        System.out
            .println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        return;
      }
    }
  }

  public void allBirds() {
    for (Bird bird : birds) {
      System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
    }
  }

  public void incrementObservations(String birdName) {
    for (Bird bird : birds) {
      if (bird.getName().equals(birdName)) {
        bird.addObservations();
        return;
      }
    }
    System.out.println("Not a bird!");
  }
}
