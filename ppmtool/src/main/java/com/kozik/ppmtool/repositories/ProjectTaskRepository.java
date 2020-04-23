package com.kozik.ppmtool.repositories;

import com.kozik.ppmtool.domain.ProjectTask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {

}