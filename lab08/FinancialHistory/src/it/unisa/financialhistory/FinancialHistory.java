package it.unisa.financialhistory;

import java.util.ArrayList;
import java.util.List;

public class FinancialHistory {
    final private Person person;
    private double balance;
    final private List<Movement> movements;

    public FinancialHistory(Person person, double balance) {
        if(balance < 0)
            throw new IllegalArgumentException("Errore: balance deve essere maggiore di 0.");
        this.person = person;
        this.balance = balance;

        this.movements = new ArrayList<>();
    }

    public void receiveFrom(int amount, String source) {
        Movement o = new Movement(source, amount);
        movements.add(o);

        this.balance += amount;
    }

    public void spendFor(int amount, String reason) {
        if(amount > this.balance)
            throw new IllegalArgumentException("Errore: l'amount è maggiore del totale del conto.");

        movements.add(new Movement(reason, amount));
        this.balance -= amount;
    }

    public double cashOnHand() {
        return this.balance;
    }

    public double totalReceivedFrom(String source) {
        double totalReceived = 0.0;
        for(Movement o : this.movements)    {
            if (o.getDescription().equals(source))
                totalReceived += o.getAmount();
        }

        return totalReceived;
    }

    public double totalSpentFor(String reason) {
        double totalSpent = 0.0;
        for(Movement o : this.movements)    {
            if (o.getDescription().equals(reason))
                totalSpent += o.getAmount();
        }

        return totalSpent;
    }

    public void printMovements() {
        for(Movement o : this.movements)
            System.out.println(o.getDescription() + "," + o.getAmount());
    }

}
