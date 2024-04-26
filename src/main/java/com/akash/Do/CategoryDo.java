package com.akash.Do;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class CategoryDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String categoryType;
	private String categoryName;
	@OneToMany(mappedBy = "categoryDo" ,cascade = CascadeType.ALL)
	@JsonIgnore
	private List<PostDo> postDo;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<PostDo> getPostDo() {
		return postDo;
	}
	public void setPostDo(List<PostDo> postDo) {
		this.postDo = postDo;
	}
	public CategoryDo(int cId, String categoryType, String categoryName, List<PostDo> postDo) {
		super();
		this.cId = cId;
		this.categoryType = categoryType;
		this.categoryName = categoryName;
		this.postDo = postDo;
	}
	@Override
	public String toString() {
		return "CategoryDo [cId=" + cId + ", categoryType=" + categoryType + ", categoryName=" + categoryName
				+ ", postDo=" + postDo + "]";
	}
	
	public CategoryDo() {
		// TODO Auto-generated constructor stub
	}
}
