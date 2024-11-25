package io.github.patrikalm;

import io.github.patrikalm.classes.Product;
import io.github.patrikalm.interfaces.Action;
import io.github.patrikalm.interfaces.Conditional;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {

    Conditional condition;
    Action action;

    public static void singleOutProducts(List<Product> products, Conditional condition, Action action) {

        for (Product product : products) {

            if (condition.test(product)) {
                action.execute(product);
            }
        }
    }



    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone 6s", 100.00, 0));
        products.add(new Product("Iphone 7", 120.00, 7));
        products.add(new Product("Iphone SE", 120.00, 0));
        products.add(new Product("Iphone 8", 150.00, 5));
        products.add(new Product("Iphone 13", 5600.00, 25));
        products.add(new Product("Iphone 16", 10000.00, 25));
        products.add(new Product("Book of Apples History", 1500.00, 5));
        products.add(new Product("Iphone 6s", 100.00, 0));
        products.add(new Product("Iphone 7", 120.00, 7));
        products.add(new Product("Iphone SE", 120.00, 0));
        products.add(new Product("Iphone 8", 150.00, 5));
        products.add(new Product("Iphone 13", 5600.00, 25));
        products.add(new Product("Iphone 16", 10000.00, 25));
        products.add(new Product("Book of Apples History", 1500.00, 5));

    //Task 1 print out all products that have stock value 0

        Action action = (Product p) -> System.out.println(p.toString());

        Conditional condition = (Product p) -> p.getStock() == 0;

        singleOutProducts(products, condition, action);

    }
}
