package com.devricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.course.entities.OrderItem;
import com.devricardo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
