package ru.yajaneya.SpringFM1GeekbrainsDz4.services;

import org.springframework.stereotype.Service;
import ru.yajaneya.SpringFM1GeekbrainsDz4.dao.ProductDao;
import ru.yajaneya.SpringFM1GeekbrainsDz4.entities.Product;

import java.util.List;

@Service
public class ProductService {

    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Product> getProducts () {
        return productDao.findAll();
    }

    public void delById (Long id) {
        productDao.deleteById(id);
    }

    public void changeCost (Long id, Integer delta) {
        Product product = productDao.findById(id);
        Integer newCost = product.getPrice() + delta;
        product.setPrice((newCost<0) ? 0 : newCost);
        productDao.saveOrUpdate(product);
    }


}
