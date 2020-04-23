package com.kozik.ppmtool.services;

import com.kozik.ppmtool.domain.Backlog;
import com.kozik.ppmtool.domain.ProjectTask;
import com.kozik.ppmtool.repositories.BacklogRepository;
import com.kozik.ppmtool.repositories.ProjectTaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask addProjectTask(String projectIdentifier, ProjectTask projectTask) {
        Backlog backlog = backlogRepository.findByProjectIdentifier(projectIdentifier);
        projectTask.setBacklog(backlog);
        Integer backlogSequence = backlog.getPTSequence();
        backlogSequence++;
        projectTask.setProjectSequence(projectIdentifier + "-" + backlogSequence);
        projectTask.setProjectIdentifier(projectIdentifier);
        if (projectTask.getPriority() == 0 || projectTask.getPriority() == null) {
            projectTask.setPriority(3);
        }
        if (projectTask.getStatus() == "" || projectTask.getStatus() == null) {
            projectTask.setStatus("TO_DO");
        }

        return projectTaskRepository.save(projectTask);
    }
}