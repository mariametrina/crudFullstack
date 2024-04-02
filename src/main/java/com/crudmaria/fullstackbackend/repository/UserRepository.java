package com.crudmaria.fullstackbackend.repository;

import com.crudmaria.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
