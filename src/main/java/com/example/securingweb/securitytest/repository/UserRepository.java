package com.example.securingweb.securitytest.repository;

import com.example.securingweb.securitytest.entity.Role;
import com.example.securingweb.securitytest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);

}
