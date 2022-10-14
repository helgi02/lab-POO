import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
  @Test
  public void takeAndGetCanTest()   {
      VendingMachine harry = new VendingMachine(60);
      harry.takeCan();
      Assert.assertEquals(1, harry.getNumberOfTokens());
      Assert.assertEquals(59, harry.getNumberOfCans());
  }

  @Test
    public void aggiungi()  {
      VendingMachine harry = new VendingMachine(60);
      harry.addCans(20);
      Assert.assertEquals(80, harry.getNumberOfCans());
  }

  @Test
    public void totale()    {
      VendingMachine harry = new VendingMachine(60);
      int ca = harry.getNumberOfCans();
      Assert.assertEquals(0, harry.getNumberOfTokens());
      Assert.assertEquals(60, harry.getNumberOfCans());
  }
}