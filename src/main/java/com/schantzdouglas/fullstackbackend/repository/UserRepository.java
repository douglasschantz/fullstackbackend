package com.schantzdouglas.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schantzdouglas.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
