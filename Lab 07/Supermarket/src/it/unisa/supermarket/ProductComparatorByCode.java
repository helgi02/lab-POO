package it.unisa.supermarket;

import java.util.Comparator;

public class ProductComparatorByCode implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        return o1.getCode().compareTo(o2.getCode());
    }

}
