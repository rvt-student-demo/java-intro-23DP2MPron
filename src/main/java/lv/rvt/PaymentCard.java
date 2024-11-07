package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }


    public void eatAffordably() {
        this.balance -= 2.60;
    }


    public void eatHeartily() {
        this.balance -= 4.60;
    }


    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
