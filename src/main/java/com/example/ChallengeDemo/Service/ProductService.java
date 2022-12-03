package com.example.ChallengeDemo.Service;

import com.example.ChallengeDemo.Entity.Product;
import com.example.ChallengeDemo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public Product getProductById(Long productId){
        return productRepository.findById(productId).get();
    }

    public void deleteProductById(Long productId){
        productRepository.deleteById(productId);
    }
}
