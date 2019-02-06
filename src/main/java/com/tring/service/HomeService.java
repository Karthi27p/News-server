package com.tring.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tring.dao.HomeDao;
import com.tring.dto.HomeDto;
import com.tring.entity.Home;
import com.tring.util.HibernateUtil;

public class HomeService {

	public void create(HomeDto dto) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		HomeDao dao = new HomeDao();
		dao.createHome(dto, session);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public List getList() {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		HomeDao dao = new HomeDao();
		List<Home> list = dao.getHome(session);
		
		System.out.println("List ==== "+list);

		session.close();
		
		return list;
		
	}
	
	public void update(HomeDto dto) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		HomeDao dao = new HomeDao();
		dao.updateHome(dto, session);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public void delete(HomeDto dto) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		HomeDao dao = new HomeDao();
		dao.deleteHome(dto, session);
		
		session.getTransaction().commit();
		session.close();
	}
}
