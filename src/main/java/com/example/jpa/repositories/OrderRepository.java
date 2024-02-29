package com.example.jpa.repositories;

import com.example.jpa.entities.Order;
import com.example.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
