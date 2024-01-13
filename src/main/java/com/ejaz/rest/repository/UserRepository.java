package com.ejaz.rest.repository;// UserRepository.java
import com.ejaz.rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
