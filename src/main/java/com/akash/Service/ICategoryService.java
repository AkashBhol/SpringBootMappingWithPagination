package com.akash.Service;

import java.util.List;

import com.akash.DTO.CategoryDto;

public interface ICategoryService {
  CategoryDto craeteCategory(CategoryDto categoryDto);
  
  List<CategoryDto> filterCategory();
}
