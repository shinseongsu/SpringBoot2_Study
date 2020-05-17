package com.example.spring.repository;

import com.example.spring.vo.Order;

public interface OrderRepository {
    Order save(Order order);
}
