package ru.yajaneya.SpringFM1GeekbrainsDz4.services;

import org.springframework.stereotype.Service;
import ru.yajaneya.SpringFM1GeekbrainsDz4.data.Product;
import ru.yajaneya.SpringFM1GeekbrainsDz4.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts () {
        return productRepository.getProducts();
    }

    public void delById (Long id) {
        productRepository.delById(id);
    }

    public void changeCost (Long id, Integer delta) {
        Product product =productRepository.findById(id);
        Integer newCost = product.getCost() + delta;
        product.setCost((newCost<0) ? 0 : newCost);
    }


}
