package com.spring.example.repository;

import com.spring.example.vo.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

}