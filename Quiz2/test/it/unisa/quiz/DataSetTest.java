package it.unisa.quiz;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.crypto.Data;

public class DataSetTest {
    @Test
    public void testMinimum() {
        Quiz q1 = new Quiz(7.5);
        Quiz q2 = new Quiz(6);
        Quiz q3 = new Quiz(8);

        DataSet data = new DataSet();

        data.add(q1);
        data.add(q2);
        data.add(q3);

        Assert.assertEquals(6, data.getMinimum().getMeasure(), 0);
    }

    @Test
    public void testMaximum() {
        Quiz q1 = new Quiz(7.5);
        Quiz q2 = new Quiz(6);
        Quiz q3 = new Quiz(8);

        DataSet data = new DataSet();

        data.add(q1);
        data.add(q2);
        data.add(q3);

        Assert.assertEquals(8, data.getMaximum().getMeasure(), 0);
    }

    @Test
    public void testAverage() {
        Quiz q1 = new Quiz(7.5);
        Quiz q2 = new Quiz(6);
        Quiz q3 = new Quiz(8);

        DataSet data = new DataSet();

        data.add(q1);
        data.add(q2);
        data.add(q3);

        Assert.assertEquals(7.2, data.getAverage(), 0.1);
    }
}