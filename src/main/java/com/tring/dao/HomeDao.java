package com.tring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tring.dto.HomeDto;
import com.tring.entity.Home;

public class HomeDao {

	public void createHome(HomeDto dto, Session session) {
		
		Home home = new Home();
		home.setTitle(dto.getTitle());
		home.setBody(dto.getBody());
		
		session.save(home);
	}
	
	public List getHome(Session session) {
		
		String queryString = "FROM Home";
		Query query = session.createQuery(queryString);
		List<Home> list = new ArrayList<>();
		list = query.getResultList();

		System.out.println("List ==== "+list);
		return list;
	}
	
	public void updateHome(HomeDto dto, Session session) {
		
		Home home = session.find(Home.class, dto.getHomeId());
		System.out.println("List ==== "+home.getTitle());

		home.setTitle(dto.getTitle());
		home.setBody(dto.getBody());
		
		session.update(home);
	}
	
public void deleteHome(HomeDto dto, Session session) {
		
		Home home = session.find(Home.class, dto.getHomeId());
		System.out.println("List ==== "+home.getTitle());
		
		session.delete(home);
	}
}
