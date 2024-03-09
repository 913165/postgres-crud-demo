package com.example.postcrudexample.service;

import com.example.postcrudexample.dao.ProductDAO;
import com.example.postcrudexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    public Product getProductById(Long id) {
        return productDAO.getProductById(id);
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }

    public void deleteProduct(Long id) {
        productDAO.deleteProduct(id);
    }
}
