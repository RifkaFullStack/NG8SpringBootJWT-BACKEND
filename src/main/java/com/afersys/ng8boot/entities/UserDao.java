package com.afersys.ng8boot.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table (name="users")
public class UserDao implements Serializable {

	public UserDao(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDao() {

	}

	public UserDao(String username, String password, boolean activated, List<Role> roles) {
		super();
		this.username = username;
		this.password = password;
		this.activated = activated;
		this.roles = roles;
	}

	@Id
	private String username;

	
	private String password;

	private boolean activated;

	@ManyToMany
	@JoinTable(name = "users_role")
	private Collection<Role> roles;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
