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

import com.akash.DTO.CategoryDto;
import com.akash.Service.ICategoryService;

@RequestMapping("/api/v2")
@RestController
public class CategoryController {

	@Autowired
	private ICategoryService service;
	
	@PostMapping("/post/category")
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
		CategoryDto craeteCategory = this.service.craeteCategory(categoryDto);
		return new ResponseEntity<CategoryDto>(craeteCategory,HttpStatus.CREATED);
	}
	
	@GetMapping("/get/category")
	public ResponseEntity<List<CategoryDto>> filterCategoty(){
		List<CategoryDto> filterCategory = this.service.filterCategory();
		return new ResponseEntity<List<CategoryDto>>(filterCategory,HttpStatus.OK);
	}
}
