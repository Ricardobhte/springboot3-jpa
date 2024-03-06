package com.devricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.course.entities.Category;
import com.devricardo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
