package com.ghy.dao.impl;


import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.ghy.model.Role;
import com.ghy.model.User;

/**  
*  
*
* @author ghy
* @date 2017年7月1日
* 类说明  :
*/
@Component
public class TestDaoImpl extends BaseDaoImpl<User, Integer>{

	/*public void test(){
		Session session = getSession();
		
		String sql = "SELECT user.*,role.* FROM t_user AS user LEFT JOIN t_role AS role "
				+ " ON user.role_id = role.id WHERE role.id = 2";
		
		session.createSQLQuery(sql).addEntity(User.class).addEntity(Role.class).list();
		
		closeSession(session);
	}*/
	
	/**
	 * 测试悲观锁
	 * @author ghy
	 * @throws IOException 
	 */
	public void test() {
		Session session = getSession();
		
		//Transaction tc = session.beginTransaction();
		
		
		int num = (int) session.createSQLQuery("SELECT status FROM t_goods WHERE id = 1").uniqueResult();
		
		
		try {
			if(num == 1){
				
				//Thread.sleep(3 * 1000);
				session.createSQLQuery("INSERT INTO t_orders VALUES(null,1)").executeUpdate();
				session.createSQLQuery("UPDATE t_goods SET status = 2").executeUpdate();
			} 
			
			
			throw new IOException();
			//tc.commit();
			//int error = 1/0;
		} catch (IOException e) {
			// TODO: handle exception
		}
		
			
			//tc.
			
		
		
		
		
		
	}
}

