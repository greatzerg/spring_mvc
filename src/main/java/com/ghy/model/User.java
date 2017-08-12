package com.ghy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

/**  
*  
*
* @author ghy  
* @date 2017年5月13日
* 类说明  :
*/
@Entity
@Table(name = "t_user")
public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6934630401601581044L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username",length = 18)
	private String username;
	
	@Column(name = "password",length = 32)
	private String password;
	
	@Column(name = "role_id")
	private String roleId;
	
	public User(){}
	

	public User(Integer id, String username, String password, String roleId) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.roleId = roleId;
	}




	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}

