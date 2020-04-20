package com.kozik.ppmtool.repositories;

import java.util.List;

import com.kozik.ppmtool.domain.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Override
    List<Project> findAllById(Iterable<Long> iterable);
}