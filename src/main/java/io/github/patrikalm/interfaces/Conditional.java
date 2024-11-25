package io.github.patrikalm.interfaces;

import io.github.patrikalm.classes.Product;

@FunctionalInterface
public interface Conditional {

    boolean test(Product p);

}
