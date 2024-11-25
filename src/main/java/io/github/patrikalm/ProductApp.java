package io.github.patrikalm;

import io.github.patrikalm.classes.Product;
import io.github.patrikalm.interfaces.Action;
import io.github.patrikalm.interfaces.Conditional;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    List<Product> products = new ArrayList<>();

    Conditional condition;

    Action action;

    public static void singleOutProducts(List<Product> products, Conditional condition, Action action) {

        List<Product> passedProducts = new ArrayList<>();

        for (Product product : products) {

            if (condition.test(product)) {
                action.execute(product);
            }
        }
    }



    public static void main(String[] args) {

    }
}
