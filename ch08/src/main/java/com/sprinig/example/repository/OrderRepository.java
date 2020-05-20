package com.sprinig.example.repository;

import com.sprinig.example.vo.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

}