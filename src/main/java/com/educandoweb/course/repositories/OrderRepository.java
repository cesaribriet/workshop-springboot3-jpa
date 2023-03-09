package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

// Responsavel pelas operacoes CRUD do banco
public interface OrderRepository extends JpaRepository<Order, Long>{

}
