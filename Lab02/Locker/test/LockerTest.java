import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void lockTest()  {
        Locker lock = new Locker();

        Assert.assertTrue(lock.isOpen());
        lock.lock();
        Assert.assertFalse(lock.isOpen());
    }
    @Test
    public void lock1Test() {
        Locker lock = new Locker();
        lock.newComb("wow");
        Assert.assertTrue(lock.isOpen());
        lock.lock();
        Assert.assertFalse(lock.isOpen());
        lock.unlock("wow");
        Assert.assertTrue(lock.isOpen());
    }
    @Test
    public void lock2Test() {
        Locker lock = new Locker();
        lock.newComb("wow");
        Assert.assertTrue(lock.isOpen());
        lock.lock();
        Assert.assertFalse(lock.isOpen());
        lock.unlock("now");
        Assert.assertFalse(lock.isOpen());
    }
}