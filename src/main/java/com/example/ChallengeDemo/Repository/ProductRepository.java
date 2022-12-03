package com.example.ChallengeDemo.Repository;

import com.example.ChallengeDemo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
