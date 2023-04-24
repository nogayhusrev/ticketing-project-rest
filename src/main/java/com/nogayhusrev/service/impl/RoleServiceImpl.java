package com.nogayhusrev.service.impl;

import com.nogayhusrev.dto.RoleDTO;
import com.nogayhusrev.entity.Role;
import com.nogayhusrev.mapper.MapperUtil;
import com.nogayhusrev.mapper.RoleMapper;
import com.nogayhusrev.repository.RoleRepository;
import com.nogayhusrev.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;
    private final MapperUtil mapperUtil;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper, MapperUtil mapperUtil) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        List<Role> roleList = roleRepository.findAll();
//        return roleList.stream().map(roleMapper::convertToDto).collect(Collectors.toList());
        return roleList.stream().map(role -> mapperUtil.convert(role, new RoleDTO())).collect(Collectors.toList());
//        return roleList.stream().map(role -> mapperUtil.convert(role, RoleDTO.class)).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {


        return roleMapper.convertToDto(roleRepository.findById(id).get());
    }
}
