package com.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.Do.PostDo;

public interface PostRepo extends JpaRepository<PostDo,Integer>{

}
