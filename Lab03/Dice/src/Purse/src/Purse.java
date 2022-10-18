import java.util.ArrayList;
import java.util.List;

public class Purse {

    final static Coin DOLLAR = new Coin("dollar", 1.00);
    final static Coin QUARTER= new Coin("quarter", 0.25);
    final static Coin DIME = new Coin("dime", 0.10);
    final static Coin NICKEL = new Coin("nickel", 0.05);
    final static Coin CENT = new Coin("cent", 0.01);

    private final List<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    public void add(Coin coin) {
        coins.add(coin);
    }

    public boolean find(Coin acoin) {
        for(Coin ca : coins)    {
            if (ca.equals(acoin))
                return true;
        }
        return false;
    }

    public int count(Coin coin) {
        int matches = 0;
        for (Coin c : coins)    {
            if(c.equals(coin))
                matches++;
        }

        return matches;
    }

    public Coin getMinimum() {
        if (coins.size() == 0)
            return null;

        Coin min = coins.get(0);
        for (Coin c: coins) {
            if (c.getValue() < min.getValue())
                min = c;
        }
        return min;
    }

    public Coin getMaximum() {
        Coin max = coins.get(0);
        for (Coin c : coins)    {
            if(c.getValue() > max.getValue())
                max = c;
        }

        return max;
    }

    public double getTotal() {
        double total = 0;
        for(int i = 0; i < coins.size(); i++)   {
            Coin acoin = coins.get(i);
            total += acoin.getValue();
        }

        return total;
    }

    public void remove(Coin coin) {
        coins.remove(coin);
    }

    public boolean hasCoin(Coin coin) {
        for(Coin c : coins) {
            if (coin.getValue() == c.getValue())
                return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Purse: Dollar = " + count(DOLLAR) + ", " +
                "Quarter = " + count(QUARTER) + ", " +
                "Dime = " + count(DIME) + ", " +
                "Nickel = " + count(NICKEL) + ", " +
                "Cent = " + count(CENT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Purse pur = (Purse) o;
        return pur.count(DOLLAR) == this.count(DOLLAR)
                && pur.count(QUARTER) == this.count(QUARTER)
                && pur.count(DIME) == this.count(DIME)
                && pur.count(NICKEL) == this.count(NICKEL)
                && pur.count(CENT) == this.count(CENT);
    }
}