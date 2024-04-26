package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akash.DTO.PostDto;
import com.akash.DTO.Responce;
import com.akash.Service.IPostService;
import com.akash.bean.AppContext;

@RequestMapping("/api/v2")
@RestController
public class PostController {

	@Autowired
	private IPostService service;

	@PostMapping("/create/post")
	public ResponseEntity<PostDto> createPost(@RequestParam int uId, @RequestParam int cId,
			@RequestBody PostDto postDto) {
		PostDto createPost = this.service.createPost(uId, cId, postDto);
		return new ResponseEntity<PostDto>(createPost, HttpStatus.CREATED);
	}

	@GetMapping("/get/post")
	public ResponseEntity<List<PostDto>> filterPost() {
		List<PostDto> filterPostDos = this.service.filterPostDos();
		return new ResponseEntity<List<PostDto>>(filterPostDos, HttpStatus.OK);
	}

	@GetMapping("/get/paginations")
	public ResponseEntity<Responce> filterPostsUsingPagination(
			@RequestParam(value = "pageNo", defaultValue = AppContext.PAGE_NO, required = false) int pageNo,
			@RequestParam(value = "pageSize", defaultValue = AppContext.PAFE_SIZE, required = false) int pageSize
			) {
		Responce filterPostsUsingPagination = this.service.filterPostsUsingPagination(pageNo, pageSize);
		return new ResponseEntity<Responce>(filterPostsUsingPagination, HttpStatus.OK);
	}

}
