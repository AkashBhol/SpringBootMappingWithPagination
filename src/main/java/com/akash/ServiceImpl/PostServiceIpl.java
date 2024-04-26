package com.akash.ServiceImpl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.akash.DTO.PostDto;
import com.akash.DTO.Responce;
import com.akash.DTO.UserDto;
import com.akash.Do.CategoryDo;
import com.akash.Do.PostDo;
import com.akash.Do.UserDo;
import com.akash.Service.IPostService;
import com.akash.repo.CategoRepo;
import com.akash.repo.PostRepo;
import com.akash.repo.UserRepo;

@Service
public class PostServiceIpl implements IPostService {

	@Autowired
	private PostRepo repo;

	@Autowired
	private UserRepo uRepo;

	@Autowired
	private CategoRepo cRepo;

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private static final Logger logInfo = LoggerFactory.getLogger(PostServiceIpl.class);

	

	@Override
	public List<PostDto> filterPostDos() {
     List<PostDo> findAll = this.repo.findAll();
     logInfo.info("all the post are"+findAll);
     List<PostDto> collect = findAll.stream().map((p)->this.mapper.map(p, PostDto.class)).collect(Collectors.toList());
		return collect;
	}

	@Override
	public PostDto createPost(int uId, int cId, PostDto postDto) {
		UserDo userDo = this.uRepo.findById(uId).orElseThrow();
		CategoryDo categoryDo = this.cRepo.findById(cId).orElseThrow();
		// PostDo postDo = this.mapper.map(PostDto,PostDo.class);
		PostDo postDo = this.mapper.map(postDto, PostDo.class);
		postDo.setUserdo(userDo);
		postDo.setCategoryDo(categoryDo);
		PostDo save = this.repo.save(postDo);
		PostDto map = this.mapper.map(save, PostDto.class);
		return map;
	}

	@Override
	public Responce filterPostsUsingPagination(int pageNo, int pageSize) {
		  Pageable pageable = PageRequest.of(pageNo, pageSize);
		  Page<PostDo> findAll = this.repo.findAll(pageable);
		  List<PostDto> collect = findAll.getContent().stream().map((p)->this.mapper.map(p, PostDto.class)).collect(Collectors.toList());
		  Responce responce=new Responce();
		  responce.setPosts(collect);
		  responce.setPageNo(findAll.getNumber());
		  responce.setPageSize(findAll.getSize());
		  responce.setTotalElement(findAll.getTotalElements());
		  responce.setLastpage(findAll.isLast());
		  return responce;
	}
}
