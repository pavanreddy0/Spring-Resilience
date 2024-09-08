package com.catalog_service.catalog_service.repository;

import com.catalog_service.catalog_service.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findByCategory(String category);
}
