public class Book {
  private String title;
  private int pages;
  private int year;

  public Book(String initialTitleString, int initialPages, int initialYear) {
    this.title = initialTitleString;
    this.pages = initialPages;
    this.year = initialYear;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return title + ", " + pages + " pages, " + year;
  }

}
