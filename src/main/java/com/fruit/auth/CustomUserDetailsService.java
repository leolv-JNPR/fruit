package com.fruit.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService{
	
	private String USER_ADMIN = "admin";
	private String PASS_ADMIN = "adminpass";

	private String USER = "user";
	private String PASS = "userpass";

	@Override
	public UserDetails loadUserByUsername(String authentication)
			throws UsernameNotFoundException {
		CustomUserData customUserData = new CustomUserData();
		// You can talk to any of your user details service and get the
		// authentication data and return as CustomUserData object then spring
		// framework will take care of the authentication
		if (USER_ADMIN.equals(authentication)) {
			customUserData.setAuthentication(true);
			customUserData.setPassword(PASS_ADMIN);
			Collection<CustomRole> roles = new ArrayList<CustomRole>();
			CustomRole customRole = new CustomRole();
			customRole.setAuthority("ROLE_ADMIN");
			roles.add(customRole);
			customUserData.setAuthorities(roles);
			return customUserData;
		} else if (USER.equals(authentication)) {
			customUserData.setAuthentication(true);
			customUserData.setPassword(PASS);
			Collection<CustomRole> roles = new ArrayList<CustomRole>();
			CustomRole customRole = new CustomRole();
			customRole.setAuthority("ROLE_USER");
			roles.add(customRole);
			customUserData.setAuthorities(roles);
			return customUserData;
		} else {
			return null;
		}
	}
	
	/**
	 * Custom Role class for manage the authorities
	 * @author lveyo
	 *
	 */
	private class CustomRole implements GrantedAuthority {
		/**
		 * 
		 */
		private static final long serialVersionUID = 622921383725579340L;
		String role = null;

		@Override
		public String getAuthority() {
			return role;
		}

		public void setAuthority(String roleName) {
			this.role = roleName;
		}

	}

}
