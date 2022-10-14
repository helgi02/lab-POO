public class Car {
    private double gas;
    private final double consumptionRate;



    public Car(double consumptionRate)  {
        this.consumptionRate = consumptionRate;
        gas = 0.0;
    }

    public double getGas() {
        return gas;
    }

    public void addGas(double gas) {
        this.gas += gas;
    }

    public void drive(double km) {
        double consumedGas = this.consumptionRate * km ;
        gas -= consumedGas;
    }
}