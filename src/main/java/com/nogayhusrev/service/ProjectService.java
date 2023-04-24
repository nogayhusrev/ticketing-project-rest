package com.nogayhusrev.service;

import com.nogayhusrev.dto.ProjectDTO;
import com.nogayhusrev.dto.UserDTO;

import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);

    List<ProjectDTO> listAllProjects();

    void save(ProjectDTO dto);

    void update(ProjectDTO dto);

    void delete(String code);

    void complete(String code);

    List<ProjectDTO> listAllProjectDetails();

    List<ProjectDTO> listAllNonCompletedByAssignedManager(UserDTO assignedManager);

}
