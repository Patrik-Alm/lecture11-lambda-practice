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


    //Task 1 print out all products that have stock value 0

        /* Action action1 = (Product p) -> System.out.println(p.toString());
        Conditional condition1 = (Product p) -> p.getStock() == 0;

        singleOutProducts(products, condition1, action1); */

    // Task 2 print out the productName of all the products that starts with B

       /* Action action2 = (Product p) -> System.out.println("Product name: " + p.getProductName());
        Conditional condition2 = (Product p) -> p.getProductName().startsWith("B");

        singleOutProducts(products, condition2, action2); */

    // Task 3 print out all products that have a price above 100 AND lower than 150

        Action action3 = (Product p) -> System.out.println(p.toString());
        Conditional condition3 = (Product p) -> 100 < p.getPrice() && p.getPrice() < 150;

        singleOutProducts(products, condition3, action3);



    }
}
