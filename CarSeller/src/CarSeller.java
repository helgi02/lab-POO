import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {
        this.cars = new ArrayList<>();
    }

    public void getElementsOfFile(File fp)  throws FileNotFoundException{
        Scanner input = new Scanner(fp);
        while(input.hasNextLine())  {
            String brand = input.nextLine();
            String model = input.nextLine();
            int year = Integer.parseInt(input.nextLine());
            double price = Double.parseDouble(input.nextLine());
            Car us = new Car(brand, model, year, price);
            this.cars.add(us);
        }
    }

    public List<Car> findBrandModel(String brand, String model) {
        List <Car> interesting = new ArrayList<>();
        for(Car to : this.cars){
            if (to.getBrand().equals(brand) && to.getModel().equals(model))
                interesting.add(to);
        }
        return interesting;
    }

    public List <Car> findYear(String brand, String model, int year)   {
        List <Car> interesting = new ArrayList<>();
        for(Car to : cars){
            if (to.getBrand().equals(brand) && to.getModel().equals(model) && to.getManufacturingYear() >= year)
                interesting.add(to);
        }
        return interesting;
    }

    public List <Car> findPrice(String brand, String model, int year, int minPrice, int maxPrice)   {
        List <Car> interesting = new ArrayList<>();
        for(Car to : this.cars){
            if (to.getBrand().equals(brand) && to.getModel().equals(model)
                    && to.getManufacturingYear() >= year
                    && to.getPrice() >= minPrice && to.getPrice() <= maxPrice)
                interesting.add(to);
        }
        return interesting;
    }

}