package com.kim.TeaShop.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kim.TeaShop.dto.UserDto;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.UserRepository;


public interface UserService {
	void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}