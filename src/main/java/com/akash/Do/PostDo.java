package com.akash.Do;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class PostDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String postTitle;
	private String postDescription;
	@ManyToOne
	private UserDo userdo;
	@ManyToOne
	private CategoryDo categoryDo;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
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
	public PostDo(int pId, String postTitle, String postDescription, UserDo userdo, CategoryDo categoryDo) {
		super();
		this.pId = pId;
		this.postTitle = postTitle;
		this.postDescription = postDescription;
		this.userdo = userdo;
		this.categoryDo = categoryDo;
	}
//	@Override
//	public String toString() {
//		return "PostDo [pId=" + pId + ", postTitle=" + postTitle + ", postDescription=" + postDescription + ", userdo="
//				+ userdo + ", categoryDo=" + categoryDo + "]";
//	}
	public PostDo() {
		// TODO Auto-generated constructor stub
	}
	
}
