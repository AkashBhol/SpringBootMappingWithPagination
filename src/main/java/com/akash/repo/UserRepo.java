package com.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.Do.UserDo;

public interface UserRepo extends JpaRepository<UserDo, Integer>{

}
