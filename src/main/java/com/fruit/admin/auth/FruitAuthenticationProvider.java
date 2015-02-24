package com.fruit.admin.auth;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component(value = "authenticationProvider")
public class FruitAuthenticationProvider implements AuthenticationProvider{
	
	private static Logger logger = Logger.getLogger(FruitAuthenticationProvider.class);

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		logger.info("authenticate " + authentication.getPrincipal().toString());
		return null;
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
