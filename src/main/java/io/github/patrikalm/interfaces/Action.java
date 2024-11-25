package io.github.patrikalm.interfaces;

import io.github.patrikalm.classes.Product;

@FunctionalInterface
public interface Action {

    void execute(Product p);

}
