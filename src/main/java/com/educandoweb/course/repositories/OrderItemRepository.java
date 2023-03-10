package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

// Responsavel pelas operacoes CRUD do banco
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
