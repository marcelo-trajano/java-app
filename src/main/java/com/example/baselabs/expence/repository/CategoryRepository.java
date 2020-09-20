package com.example.baselabs.expence.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baselabs.expence.model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

