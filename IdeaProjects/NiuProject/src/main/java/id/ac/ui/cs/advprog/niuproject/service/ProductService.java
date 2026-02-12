package id.ac.ui.cs.advprog.niuproject.service;

import id.ac.ui.cs.advprog.niuproject.model.Product;
import java.util.List;

public interface ProductService {
    public  Product create(Product product);
    public  List<Product> findAll();
}
