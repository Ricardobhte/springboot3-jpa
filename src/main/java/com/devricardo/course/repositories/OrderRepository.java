package com.devricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
