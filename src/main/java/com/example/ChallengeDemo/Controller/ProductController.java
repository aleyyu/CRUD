package com.example.ChallengeDemo.Controller;

import com.example.ChallengeDemo.Entity.Product;
import com.example.ChallengeDemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product addProduct = productService.addProduct(product);
        return new ResponseEntity<Product>(addProduct, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProduct(){
        List<Product> allProduct = productService.findAllProduct();
        return new ResponseEntity<List<Product>>(allProduct, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        Product productById = productService.getProductById(id);
        return new ResponseEntity<Product>(productById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable("id") Long id){
        productService.deleteProductById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
