package com.kozik.ppmtool.repositories;

import com.kozik.ppmtool.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User getById(Long id);
}