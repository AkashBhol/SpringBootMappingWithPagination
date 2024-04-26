package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.DTO.UserDto;
import com.akash.Service.IUserService;

@RestController
@RequestMapping("/api/v2")
public class UserController {

	@Autowired
	private IUserService service;
	
	
	@PostMapping("/post/user")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto craeteUser = this.service.craeteUser(userDto);
		return new ResponseEntity<UserDto>(craeteUser,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get/user")
	public ResponseEntity<List<UserDto>> filterUserDto(){
		List<UserDto> filterUserDtos = this.service.filterUserDtos();
		return new ResponseEntity<List<UserDto>>(filterUserDtos,HttpStatus.OK);
	}
}
