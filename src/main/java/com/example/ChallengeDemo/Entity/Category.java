package com.example.ChallengeDemo.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @SequenceGenerator(name = "seq_cateogry", allocationSize = 1)
    @GeneratedValue(generator = "seq_cateogry", strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "category_name")
    private String name;

    public Category() {
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
