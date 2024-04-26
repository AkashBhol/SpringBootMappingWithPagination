package com.akash.DTO;

import com.akash.Do.CategoryDo;
import com.akash.Do.UserDo;

public class PostDto {
	private String postTitle;
	private String postDescription;
	private UserDo userdo;
	private CategoryDo categoryDo;
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostDescription() {
		return postDescription;
	}
	public void setPostDescription(String postDescription) {
		this.postDescription = postDescription;
	}
	public UserDo getUserdo() {
		return userdo;
	}
	public void setUserdo(UserDo userdo) {
		this.userdo = userdo;
	}
	public CategoryDo getCategoryDo() {
		return categoryDo;
	}
	public void setCategoryDo(CategoryDo categoryDo) {
		this.categoryDo = categoryDo;
	}
	public PostDto(String postTitle, String postDescription, UserDo userdo, CategoryDo categoryDo) {
		super();
		this.postTitle = postTitle;
		this.postDescription = postDescription;
		this.userdo = userdo;
		this.categoryDo = categoryDo;
	}
	@Override
	public String toString() {
		return "PostDto [postTitle=" + postTitle + ", postDescription=" + postDescription + ", userdo=" + userdo
				+ ", categoryDo=" + categoryDo + "]";
	}
	public PostDto() {
		// TODO Auto-generated constructor stub
	}
}
