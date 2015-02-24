package com.fruit.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * This class is provide the user details which is needed for authentication
 * @author lveyo
 *
 */
public class CustomUserData implements UserDetails{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5369011850868732428L;
	Collection<? extends GrantedAuthority> list = null;
	String userName = null;
	String password = null;
	boolean status = false;

	public CustomUserData() {
		list = new ArrayList<GrantedAuthority>();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.list;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> roles) {
		this.list = roles;
	}

	public void setAuthentication(boolean status) {
		this.status = status;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
