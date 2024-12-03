package lv.rvt;

public class PaymentTerminal {
    private double money;  
    private int affordableMeals; 
    private int heartyMeals;  

    public PaymentTerminal() {
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        double mealCost = 2.50; 
        if (payment >= mealCost) {
            this.money += mealCost; 
            this.affordableMeals++; 
            return payment - mealCost; 
        }
        return payment; 
    }

    public double eatHeartily(double payment) {
        double mealCost = 4.30; 
        if (payment >= mealCost) {
            this.money += mealCost; 
            this.heartyMeals++; 
            return payment - mealCost; 
        }
        return payment; 
    }

    public boolean eatAffordably(PaymentCard card) {
        double mealCost = 2.50; 
        if (card.takeMoney(mealCost)) { 
            this.affordableMeals++; 
            return true; 
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double mealCost = 4.30; 
        if (card.takeMoney(mealCost)) { 
            this.heartyMeals++; 
            return true; 
        }
        return false; 
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}