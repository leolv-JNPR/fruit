package com.fruit.admin.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FruitUserDetailsService implements UserDetailsService {
	
	private static Logger logger = Logger.getLogger(FruitUserDetailsService.class);

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		logger.info("loadUser: "+username);
		if("super".equals(username)){
			
	        boolean enabled = true;
	        boolean accountNonExpired = true;
	        boolean credentialsNonExpired = true;
	        boolean accountNonLocked = true;
	        logger.info("login ok");
			return  new org.springframework.security.core.userdetails.User
			          ("super", 
			          "passwd", getAuthorities(1));
		} else {
			logger.info("none user");
            throw new UsernameNotFoundException("No user found with username: "+ username);
        }
		
	}
	
	private Collection<? extends GrantedAuthority>getAuthorities(Integer role){
        List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
        return authList;
    }
    private List<String> getRoles(Integer role) {
        List<String> roles = new ArrayList<String>();
        if (role.intValue() == 1) {
            roles.add("ROLE_ADMIN");
            
        } else if (role.intValue() == 2) {
            roles.add("ROLE_USER");
        }
        return roles;
    }   
    private static List<GrantedAuthority> getGrantedAuthorities (List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }

}
