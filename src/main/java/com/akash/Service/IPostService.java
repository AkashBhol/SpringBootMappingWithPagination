package com.akash.Service;

import java.util.List;

import com.akash.DTO.PostDto;
import com.akash.DTO.Responce;

public interface IPostService {
 PostDto createPost(int uId,int cId,PostDto postDto);
 
 List<PostDto> filterPostDos();
 
 //getting listOfPosts using pagination
 
 Responce filterPostsUsingPagination(int pageNo,int pageSize);
}
