public class Timer {
  private int ms;
  private int seconds;

  public Timer() {
    this.ms = 0;
    this.seconds = 0;
  }

  public void advance() {
    ms++;
    if (ms == 100) {
      if (seconds == 60) {
        seconds = 0;
      }
      seconds++;
      ms = 0;
    }
  }

  @Override
  public String toString() {
    return String.format("%02d", seconds) + ":" + String.format("%02d", ms);
  }
}
