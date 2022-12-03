package com.example.ChallengeDemo.Controller;

import com.example.ChallengeDemo.Entity.Category;
import com.example.ChallengeDemo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/save")
    public ResponseEntity<Category> addCategory(@RequestBody Category category){
        Category addCategory = categoryService.addCategory(category);
        return new ResponseEntity<Category>(addCategory, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> allCategory = categoryService.findAllCategory();
        return new ResponseEntity<List<Category>>(allCategory, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id){
        Category categoryById = categoryService.getCategoryById(id);
        return new ResponseEntity<Category>(categoryById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCategoryById(@PathVariable("id") Long id){
        categoryService.deleteCategoryById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
