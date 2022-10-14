import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastWordTest {
    @Test
    public void withCaps()  {
        List <String> stringList = new ArrayList<>();

        stringList.add("Ciao");
        stringList.add("Mondo");
        stringList.add("AAA");

        FirstAndLastWord flf = new FirstAndLastWord(stringList);
        flf.sort();

        Assert.assertEquals("AAA", flf.getFirst());
        Assert.assertEquals("Mondo", flf.getLast());
    }

    @Test
    public void ignoreCaps()    {
        List <String> stringList = new ArrayList<>();

        stringList.add("Ciao");
        stringList.add("Mondo");
        stringList.add("AAA");

        FirstAndLastWord flf = new FirstAndLastWord(stringList);
        flf.sortIgnoreCase();

        Assert.assertEquals("AAA", flf.getFirst());
        Assert.assertEquals("Mondo", flf.getLast());
    }
}