import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CarSellerTest {
    @Test
    public void getElementBrandAndModelTest()  {
        CarSeller carSeller = new CarSeller();
        File fp = Path.of("test/").resolve("testData.txt").toFile();
        try {
            carSeller.getElementsOfFile(fp);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Car> cercaBrand = carSeller.findBrandModel("Tesla", "Model Y");
        Assert.assertEquals(2, cercaBrand.size());

    }


    @Test
    public void getElementBrandYearTest()       {
        CarSeller carSeller = new CarSeller();
        File fp = Path.of("test/").resolve("testData.txt").toFile();

        try {
            carSeller.getElementsOfFile(fp);
        }   catch (FileNotFoundException e) {
                throw new RuntimeException(e);
        }

        List<Car> cercaYear = carSeller.findYear("Tesla", "Model Y", 2022);
        Assert.assertEquals(1, cercaYear.size());
    }


    @Test
    public void getElementBrandPriceTest()  {
        CarSeller carSeller = new CarSeller();
        File fp = Path.of("test/").resolve("testData.txt").toFile();

        try {
            carSeller.getElementsOfFile(fp);
        }   catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<Car> cercaPrice = carSeller.findPrice("Opel", "Corsa", 2008, 1500, 2200);
        Assert.assertSame(cercaPrice, cercaPrice);
    }

}