public class PaymentCard {
  private double balance;

  public PaymentCard(double openingBalance) {
    this.balance = openingBalance;
  }

  public String toString() {
    return "The card has a balance of " + balance + " euros";
  }

  public void eatAffordably() {
    // write code here
    if (balance >= 2.60) {
      balance -= 2.60;
    }

  }

  public void eatHeartily() {
    // write code here
    if (balance >= 4.60) {
      balance -= 4.60;
    }
  }

  public void addMoney(double amount) {
    if (amount + balance > 150) {
      balance = 150;
    } else if (amount > 0) {
      balance += amount;
    }
  }

}
