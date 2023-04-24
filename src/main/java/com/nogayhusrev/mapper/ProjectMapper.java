package com.nogayhusrev.mapper;

import com.nogayhusrev.dto.ProjectDTO;
import com.nogayhusrev.entity.Project;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProjectMapper {

    private final ModelMapper modelMapper;

    public ProjectMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Project convertToEntity(ProjectDTO dto) {
        return modelMapper.map(dto, Project.class);

    }

    public ProjectDTO convertToDto(Project entity) {

        return modelMapper.map(entity, ProjectDTO.class);
    }

}
