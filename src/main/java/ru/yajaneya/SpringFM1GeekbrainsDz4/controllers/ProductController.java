package ru.yajaneya.SpringFM1GeekbrainsDz4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.yajaneya.SpringFM1GeekbrainsDz4.entities.Product;
import ru.yajaneya.SpringFM1GeekbrainsDz4.services.ProductService;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts () {
        return productService.getProducts();
    }

    @GetMapping("/product/del/{id}")
    public void delProduct (@PathVariable Long id) {
        System.out.println(id);
        productService.delById(id);
    }

    @GetMapping("/product/change_cost")
    public void changeCost (@RequestParam Long productId, @RequestParam Integer delta) {
        productService.changeCost(productId, delta);
    }
}
