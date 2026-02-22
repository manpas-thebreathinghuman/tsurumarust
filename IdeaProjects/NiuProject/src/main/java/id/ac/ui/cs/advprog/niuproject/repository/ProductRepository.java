package id.ac.ui.cs.advprog.niuproject.repository;

import id.ac.ui.cs.advprog.niuproject.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return  product;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public Product findById(String id) {
        return productData.stream()
                .filter(p -> p.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Product edit(Product product) {
        Product existing = findById(product.getProductId());
        if (existing != null) {
            existing.setProductName(product.getProductName());
            existing.setProductQuantity(product.getProductQuantity());
        }
        return existing;
    }

    public void delete(Product product) {
        Product existing = findById(product.getProductId());
        if (existing != null){
            productData.remove(existing);
        }
    }
}