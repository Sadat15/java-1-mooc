public class Fitbyte {
  private int age;
  private int restingHeartRate;

  public Fitbyte(int initialAge, int rhr) {
    this.age = initialAge;
    this.restingHeartRate = rhr;
  }

  public double targetHeartRate(double percentageOfMax) {
    return (((maximum() - restingHeartRate) * percentageOfMax) + restingHeartRate);
  }

  public double maximum() {
    return 206.3 - (0.711 * age);
  }
}
