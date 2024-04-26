package com.akash.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.DTO.CategoryDto;
import com.akash.Do.CategoryDo;
import com.akash.Service.ICategoryService;
import com.akash.repo.CategoRepo;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private CategoRepo repo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private static final Logger logInfo=LoggerFactory.getLogger(CategoryServiceImpl.class);

	
	@Override
	public List<CategoryDto> filterCategory() {
		List<CategoryDo> findAll = this.repo.findAll();
		logInfo.info("The All category are"+ findAll);
		List<CategoryDto> collect = findAll.stream().map((p)->this.mapper.map(p, CategoryDto.class)).collect(Collectors.toList());
		return collect;
	}


	@Override
	public CategoryDto craeteCategory(CategoryDto categoryDto) {
		CategoryDo map = this.mapper.map(categoryDto, CategoryDo.class);
		CategoryDo save = this.repo.save(map);
		CategoryDto map2 = this.mapper.map(save, CategoryDto.class);
		return map2;
	}
}
