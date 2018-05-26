package com.jainsp.service;

import com.jainsp.converter.UserConverter;
import com.jainsp.dto.UserDto;
import com.jainsp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override

    public UserDto getUserById(Integer userId) {
        return UserConverter.entityToDto(userRepository.getOne(userId));
    }

    @Override

    public void saveUser(UserDto userDto) {
        userRepository.save(UserConverter.dtoToEntity(userDto));
    }

    @Override

    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
    }
}
