package com.jainsp.service;

import com.jainsp.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Integer userId);

    void saveUser(UserDto userDto);

    List< UserDto > getAllUsers();
}
