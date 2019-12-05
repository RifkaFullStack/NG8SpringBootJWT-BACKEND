package com.afersys.ng8boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afersys.ng8boot.entities.UserDao;



public interface UserRepository extends JpaRepository<UserDao, String> {
	
    UserDao findByUsername(String username);
}
