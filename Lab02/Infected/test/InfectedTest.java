import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    @Test
        public void infettiTest()   {
            Infected mal = new Infected("malaria");
            mal.addInfected(30);
            Assert.assertEquals("malaria", mal.getDisease());
            Assert.assertEquals(30, mal.getNumberOfInfected());
    }

    public void infectedTest2() {
        Infected mal = new Infected("malaria", 53);
        mal.updateInfectedByRt(2.7);
        Assert.assertEquals("malaria", mal.getDisease());
        Assert.assertEquals(53, mal.getNumberOfInfected());
        Assert.assertEquals(143, mal.getNumberOfInfected());
    }
}