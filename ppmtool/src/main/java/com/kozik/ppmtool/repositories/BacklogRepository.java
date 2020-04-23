package com.kozik.ppmtool.repositories;

import com.kozik.ppmtool.domain.Backlog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Long> {

}