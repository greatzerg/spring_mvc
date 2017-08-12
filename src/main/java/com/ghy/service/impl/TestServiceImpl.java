package com.ghy.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghy.dao.impl.TestDaoImpl;
import com.ghy.service.UserService;

/**  
*  
*
* @author ghy
* @date 2017年7月1日
* 类说明  :
*/
@Service
public class TestServiceImpl {

	@Autowired
	private TestDaoImpl testDaoImpl;
	
	public void test() {
	
		
		testDaoImpl.test();
	}
}

