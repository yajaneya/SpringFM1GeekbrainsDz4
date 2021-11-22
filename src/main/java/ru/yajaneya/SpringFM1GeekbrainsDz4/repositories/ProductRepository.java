package ru.yajaneya.SpringFM1GeekbrainsDz4.repositories;

import org.springframework.stereotype.Component;
import ru.yajaneya.SpringFM1GeekbrainsDz4.data.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(List.of(
           new Product(1L, "Milk", 50),
           new Product(2L, "Bred", 30),
           new Product(3L, "Solt", 15),
           new Product(4L, "Soda", 12),
           new Product(5L, "Tea", 75),
           new Product(6L, "Q", 1)
        ));

    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product findById (Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void delById (Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

}
