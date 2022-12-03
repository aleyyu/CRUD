package com.example.ChallengeDemo.Service;

import com.example.ChallengeDemo.Entity.Category;
import com.example.ChallengeDemo.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> findAllCategory(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long categoryId){
        return categoryRepository.findById(categoryId).get();
    }

    public void deleteCategoryById(Long categoryId){
        categoryRepository.deleteById(categoryId);
    }


}
