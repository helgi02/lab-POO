package it.unisa.country;

import org.junit.Assert;
import org.junit.Test;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Country n1 = new Country("Italia", 50000000.25);
        Country n2 = new Country("Spagna", 25641325.95);
        Country n3 = new Country("Brasile", 2451566.25);

        DataSet dataset = new DataSet();

        dataset.add(n1);
        dataset.add(n2);
        dataset.add(n3);

        Assert.assertEquals("Brasile", dataset.getMinimum().getName());
    }

    @Test
    public void testMaximum() {
        Country n1 = new Country("Italia", 50000000.25);
        Country n2 = new Country("Spagna", 25641325.95);
        Country n3 = new Country("Brasile", 2451566.25);

        DataSet dataset = new DataSet();

        dataset.add(n1);
        dataset.add(n2);
        dataset.add(n3);

        Assert.assertEquals("Italia", dataset.getMaximum().getName());
    }
}