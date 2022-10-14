import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
        public void crushTest()   {
            Car opel = new Car(0.5);
            Assert.assertEquals(0.0, opel.getGas(), 0);
            opel.addGas(30.0);
            Assert.assertEquals(30.0, opel.getGas(), 0);
            opel.drive(10.2);
            Assert.assertEquals(24.9, opel.getGas(), 0);
    }

}