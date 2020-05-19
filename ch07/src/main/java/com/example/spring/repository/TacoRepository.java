package com.example.spring.repository;

import com.example.spring.vo.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {

    // Taco save(Taco design);
}
