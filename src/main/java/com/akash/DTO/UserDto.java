package com.akash.DTO;

import java.util.List;

import com.akash.Do.PostDo;

public class UserDto {
	private int uId;
	private String name;
	private String city;
	//private List<PostDo> postDo;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
//	public List<PostDo> getPostDo() {
//		return postDo;
//	}
//	public void setPostDo(List<PostDo> postDo) {
//		this.postDo = postDo;
//	}
	@Override
	public String toString() {
		return "UserDto [uId=" + uId + ", name=" + name + ", city=" + city + ", postDo=" + "]";
	}
	public UserDto(int uId, String name, String city, List<PostDo> postDo) {
		super();
		this.uId = uId;
		this.name = name;
		this.city = city;
		//this.postDo = postDo;
	}
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
}
