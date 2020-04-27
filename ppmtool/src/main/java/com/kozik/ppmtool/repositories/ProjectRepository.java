package com.kozik.ppmtool.repositories;

import com.kozik.ppmtool.domain.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project findByProjectIdentifier(String projectIdentifier);

    Iterable<Project> findAllByProjectLeader(String user);
}