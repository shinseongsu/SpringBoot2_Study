package com.sprinig.example.repository;

import com.sprinig.example.vo.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}