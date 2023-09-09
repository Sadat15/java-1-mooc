import java.util.ArrayList;

public class Points {
  private ArrayList<Integer> pointsList;
  private ArrayList<Integer> passingPointsList;

  public Points() {
    pointsList = new ArrayList<>();
    passingPointsList = new ArrayList<>();
  }

  public void addToPointsList(int point) {
    pointsList.add(point);
    if (point >= 50) {
      passingPointsList.add(point);
    }
  }

  public double getPointsAverage() {
    int total = 0;
    for (Integer points : pointsList) {
      total += points;
    }

    return total * 1.0 / pointsList.size();
  }

  public double getPassingPointsAverage() {
    int total = 0;
    for (Integer points : passingPointsList) {
      total += points;
    }

    return total * 1.0 / passingPointsList.size();
  }

  public double getPassPercentage() {
    return this.passingPointsList.size() * 1.0 / this.pointsList.size() * 100;
  }

  public void getGradeDistribution() {
    // iterate through grades
    // create a variable for each grade band
    int fails = 0;
    int grade_1 = 0;
    int grade_2 = 0;
    int grade_3 = 0;
    int grade_4 = 0;
    int grade_5 = 0;

    for (int points : pointsList) {
      if (points < 50) {
        fails++;
      } else if (points < 60) {
        grade_1++;
      } else if (points < 70) {
        grade_2++;
      } else if (points < 80) {
        grade_3++;
      } else if (points < 90) {
        grade_4++;
      } else if (points >= 90) {
        grade_5++;
      }
    }

    System.out.println("5: " + "*".repeat(grade_5));
    System.out.println("4: " + "*".repeat(grade_4));
    System.out.println("3: " + "*".repeat(grade_3));
    System.out.println("2: " + "*".repeat(grade_2));
    System.out.println("1: " + "*".repeat(grade_1));
    System.out.println("0: " + "*".repeat(fails));

  }
}
