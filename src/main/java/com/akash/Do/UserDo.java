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
@Table(name = "user")
public class UserDo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String name;
	private String city;
	
	@OneToMany(mappedBy = "userdo",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<PostDo> postDo;

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

	public List<PostDo> getPostDo() {
		return postDo;
	}

	public void setPostDo(List<PostDo> postDo) {
		this.postDo = postDo;
	}

	@Override
	public String toString() {
		return "UserDo [uId=" + uId + ", name=" + name + ", city=" + city + ", postDo=" + postDo + "]";
	}

	public UserDo(int uId, String name, String city, List<PostDo> postDo) {
		super();
		this.uId = uId;
		this.name = name;
		this.city = city;
		this.postDo = postDo;
	}
	
	public UserDo() {
		// TODO Auto-generated constructor stub
	}
}
