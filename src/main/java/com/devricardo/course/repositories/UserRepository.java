package com.devricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devricardo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
