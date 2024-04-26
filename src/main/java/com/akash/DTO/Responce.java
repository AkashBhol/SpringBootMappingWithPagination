package com.akash.DTO;

import java.util.List;

public class Responce {
	private List<PostDto> posts;
	private int pageNo;
	private int pageSize;
	private Long totalElement;
	private boolean lastpage;

	public List<PostDto> getPosts() {
		return posts;
	}

	public void setPosts(List<PostDto> posts) {
		this.posts = posts;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalElement() {
		return totalElement;
	}

	public void setTotalElement(Long totalElement) {
		this.totalElement = totalElement;
	}

	public boolean isLastpage() {
		return lastpage;
	}

	public void setLastpage(boolean lastpage) {
		this.lastpage = lastpage;
	}

	@Override
	public String toString() {
		return "Responce [posts=" + posts + ", pageNo=" + pageNo + ", pageSize=" + pageSize + ", totalElement="
				+ totalElement + ", lastpage=" + lastpage + "]";
	}

	public Responce(List<PostDto> posts, int pageNo, int pageSize, Long totalElement, boolean lastpage) {
		super();
		this.posts = posts;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalElement = totalElement;
		this.lastpage = lastpage;
	}

	public Responce() {
		// TODO Auto-generated constructor stub
	}

}
