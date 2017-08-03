package com.spark.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spark.dao.StudentDao;
import com.spark.model.Student;


@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentList() {
		
		Session session = sessionFactory.openSession();
		
		String hql = "from Student";
		
		Query<Student> query = session.createQuery(hql);
		
		List<Student> stuList = query.getResultList();
		
		session.close();
		
		return stuList;
	}

}
