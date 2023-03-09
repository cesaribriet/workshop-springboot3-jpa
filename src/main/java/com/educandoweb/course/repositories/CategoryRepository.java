package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

// Responsavel pelas operacoes CRUD do banco
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
