package com.sprinig.example.repository;

import com.sprinig.example.vo.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}