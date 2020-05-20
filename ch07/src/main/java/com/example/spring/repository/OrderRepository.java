package com.example.spring.repository;

import com.example.spring.vo.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

}