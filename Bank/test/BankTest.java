import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank b = new Bank();
        b.addAccount(30000, "Helena");

        b.deposit(1, 30.2);
        Assert.assertEquals(30030.2, b.getBalance(1), 0);
    }

    @Test
    public void withdrawTest() {
        Bank b = new Bank();
        b.addAccount(30000, "Helena");

        b.withdraw(1, 1000);
        Assert.assertEquals(29000, b.getBalance(1), 0);
    }

    @Test
    public void transferTest() {
        Bank b = new Bank();
        b.addAccount(30000, "Helena");
        b.addAccount(2000, "Emmanuel");

        b.transfer(2, 1, 500);
        Assert.assertEquals(30500, b.getBalance(1), 0);
        Assert.assertEquals(1500, b.getBalance(2), 0);

    }
}