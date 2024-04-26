package com.akash.DTO;

public class CategoryDto {
	private int cId;
	private String categoryType;
	private String categoryName;
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
	public CategoryDto(int cId, String categoryType, String categoryName) {
		super();
		this.cId = cId;
		this.categoryType = categoryType;
		this.categoryName = categoryName;
	}
	public CategoryDto() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CategoryDto [cId=" + cId + ", categoryType=" + categoryType + ", categoryName=" + categoryName + "]";
	}
	
	
	
}
