package com.tring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "home")
public class Home {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="home_id", nullable = false)
	private int homeId;

	@Column(name="title", nullable = false)
	private String title;

	@Column(name="body", nullable = false)
	private String body;

	public int getHomeId() {
		return homeId;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
