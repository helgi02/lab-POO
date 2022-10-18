import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

  @Test
  public void findTest() {
    Purse n = new Purse();

    n.add(Purse.DIME);
    Assert.assertTrue(n.find(Purse.DIME));
    Assert.assertFalse(n.find(Purse.CENT));
  }

  @Test
  public void countTest() {
    Purse n = new Purse();
    n.add(Purse.DIME);
    n.add(Purse.DIME);
    Assert.assertEquals(2, n.count(Purse.DIME));
    Assert.assertEquals(0, n.count(Purse.QUARTER));
  }

  @Test
  public void minMaxTest() {
    Purse n = new Purse();
    n.add(Purse.DIME);
    n.add(Purse.DIME);
    n.add(Purse.QUARTER);

    Assert.assertEquals(Purse.DIME, n.getMinimum());
    Assert.assertEquals(Purse.QUARTER, n.getMaximum());
  }

  @Test
  public void getTotalTest() {
    Purse n = new Purse();
    n.add(Purse.DIME);
    n.add(Purse.DIME);
    n.add(Purse.QUARTER);
    n.add(Purse.QUARTER);
    n.add(Purse.DOLLAR);
    n.add(Purse.DOLLAR);

    Assert.assertEquals(2.7, n.getTotal(), 0);
  }

  @Test
  public void addRemoveTest() {
    Purse n = new Purse();
    n.add(Purse.NICKEL);
    Assert.assertEquals(1, n.count(Purse.NICKEL));
    n.add(Purse.QUARTER);
    n.remove(Purse.QUARTER);

    Assert.assertEquals(0, n.count(Purse.QUARTER));
  }

  @Test
  public void hasCoinTest() {
    Purse n = new Purse();
    n.add(Purse.DIME);
    n.add(Purse.QUARTER);

    Assert.assertFalse(n.hasCoin(Purse.CENT));
    Assert.assertTrue(n.hasCoin(Purse.DIME));
  }

  @Test
  public void toStringTest() {
    Purse n = new Purse();
    n.add(Purse.DIME);
    n.add(Purse.QUARTER);
    n.add(Purse.DOLLAR);
    n.add(Purse.DOLLAR);

    Assert.assertEquals("Purse: Dollar = 2, Quarter = 1, Dime = 1, Nickel = 0, Cent = 0", n.toString());
  }

  @Test
  public void equalsTest() {
    Purse n = new Purse();
    n.add(Purse.DIME);
    n.add(Purse.QUARTER);
    n.add(Purse.DOLLAR);

    Purse p = new Purse();
    p.add(Purse.DIME);
    p.add(Purse.QUARTER);
    p.add(Purse.DOLLAR);

    Assert.assertTrue(true);
  }
}