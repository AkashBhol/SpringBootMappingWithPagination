package com.akash.Service;

import java.util.List;

import com.akash.DTO.UserDto;

public interface IUserService {

	UserDto craeteUser(UserDto userDto);
	
	List<UserDto> filterUserDtos();
}
