package com.akash.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.DTO.UserDto;
import com.akash.Do.UserDo;
import com.akash.Service.IUserService;
import com.akash.repo.UserRepo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepo repo;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private static final Logger logInfo = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public UserDto craeteUser(UserDto userDto) {
		UserDo map = this.mapper.map(userDto, UserDo.class);
		UserDo save = this.repo.save(map);
		UserDto map2 = this.mapper.map(save, UserDto.class);
		return map2;
	}

	@Override
	public List<UserDto> filterUserDtos() {
		List<UserDo> findAll = this.repo.findAll();
		logInfo.info("this is all user"+ findAll.toString());
		List<UserDto> collect = findAll.stream().map((p)->this.mapper.map(p, UserDto.class)).collect(Collectors.toList());
		return collect;
	}
}
