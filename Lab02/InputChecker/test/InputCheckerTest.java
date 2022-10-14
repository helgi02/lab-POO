import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {
    @Test
        public void okkTest()   {
        InputChecker nuovo = new InputChecker();
        Assert.assertEquals("OK", InputChecker.checkInput("perchè no?"));
        Assert.assertEquals("OK", InputChecker.checkInput("certo"));
        Assert.assertEquals("OK", InputChecker.checkInput("OK"));
        Assert.assertEquals("OK", InputChecker.checkInput("SI"));
        Assert.assertEquals("OK", InputChecker.checkInput("S"));
    }

    @Test
    public void fineTest()  {
        InputChecker nuov = new InputChecker();
        Assert.assertEquals("Fine", InputChecker.checkInput("N"));
        Assert.assertEquals("Fine", InputChecker.checkInput("No"));
    }

    @Test
    public void nonCorrectTest()    {
        InputChecker nuo = new InputChecker();
        Assert.assertEquals("Dato non corretto", InputChecker.checkInput(""));
    }
}