package com.example.demo.domain.user;

import com.example.demo.core.generic.ExtendedService;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.management.InstanceAlreadyExistsException;
import java.util.List;
import java.util.UUID;

public interface UserService extends UserDetailsService, ExtendedService<User> {
  User register(User user) throws InstanceAlreadyExistsException;
  User getByEmail(String email);
  List<User> getAllUsers();
  User getUserById(UUID id);
}
