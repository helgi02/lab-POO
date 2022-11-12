package it.unisa.supermarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermarket {

    private List<Product> products;

    public Supermarket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {

        this.products.add(p);
        this.products.sort(new ProductComparatorByCode());
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getProductType(int i) {
        products.get(i);

        if (products.get(i) instanceof Grocery)
            return "Grocery";
        else
            return "Electronic";
    }

    public Product getMinPrice() {
        Product min = this.products.get(0);
        Product p;
        ProductComparatorByPrice n = new ProductComparatorByPrice();

        for(int i = 1; i < this.products.size(); i++)  {
            if(n.compare(min, this.products.get(i)) > 0)
                min = this.products.get(i);
        }

        return min;
    }

    public Product getMaxPrice() {
        Product max = this.products.get(0);
        Product p;
        ProductComparatorByPrice n = new ProductComparatorByPrice();

        for(int i = 1; i < this.products.size(); i++)  {
            if(n.compare(max, this.products.get(i)) < 0)
                max = this.products.get(i);
        }

        return max;
    }

    public List<Product> find(String brand) {
        List<Product> result = new ArrayList<>();

        for(Product p : this.products)  {
            if(p.getBrand().equalsIgnoreCase(brand))
                result.add(p);
        }

        return result;
    }
}
