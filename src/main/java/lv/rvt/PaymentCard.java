package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }


    public void eatAffordably() {
        if (balance < 2.60){
            this.balance += 0;
        }else{
        this.balance -= 2.60;
        }
    }


    public void eatHeartily() {
        if (balance < 4.60){
            this.balance += 0;
        }
        else{
        this.balance -= 4.60;
        }
    }


    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
