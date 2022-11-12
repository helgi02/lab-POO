package it.unisa.supermarket;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Product {

    final private String code;
    final private String description;
    final private String brand;
    private double price;
    private boolean onSale;
    private double oldPrice;
    private GregorianCalendar lastOnSaleDay;

    public Product(String code, String description, String brand, double price) {
        this.code = code;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.oldPrice = 0;
        this.onSale = false;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.oldPrice = this.price;
        this.price = newPrice;

    }

    public void putOnSale(double p, GregorianCalendar g) {

        setPrice(this.price - ((p  * this.price) / 100) );
        onSale = true;

        this.lastOnSaleDay = g;
    }

    public void checkOnSale() {
        GregorianCalendar today = new GregorianCalendar();
        //today.setTime(new Date());
        if(today.after(lastOnSaleDay))  {
            onSale = false;
            setPrice(this.oldPrice);
        }
    }

    public abstract boolean buy(int p);

}
