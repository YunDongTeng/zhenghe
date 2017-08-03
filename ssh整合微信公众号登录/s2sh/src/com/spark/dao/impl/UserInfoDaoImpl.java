package com.spark.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spark.dao.UserInfoDao;
import com.spark.model.UserInfo;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String getUserName(String openid) {

		String userName = null;

		String sql = "from UserInfo where openid= ?";

		Session session = sessionFactory.openSession();

		UserInfo userInfo = (UserInfo) session.createQuery(sql).setParameter(0, openid).uniqueResult();

		userName = userInfo == null ? null : userInfo.getUsername();
		
		session.close();
		
		return userName;
	}

	@Override
	public int updateOpenId(String username, String password, String openid) {

		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		String sql = "update UserInfo ui set ui.openid = '"+openid+"' where ui.username='"+username+"' and ui.password='"+password+"'";
	

		@SuppressWarnings("rawtypes")
		Query query = session.createQuery(sql);
		

	
		int result = query.executeUpdate();
		
		tx.commit();
		
		session.close();

		return result;
	}

}
