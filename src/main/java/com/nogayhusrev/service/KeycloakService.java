package com.nogayhusrev.service;

import com.nogayhusrev.dto.UserDTO;

import javax.ws.rs.core.Response;

public interface KeycloakService {

    Response userCreate(UserDTO dto);

    void  delete(String username);
}
