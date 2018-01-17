package com.portfolio.service;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.portfolio.dto.UserVO;

public class LoginService implements UserDetailsService {

	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVO userVO;
		try {
			userVO = userService.getUserByID(username);
		} catch (Exception e) {
			System.out.println("Error Log \n" + e);
			throw new UsernameNotFoundException("No user found with username" + username);
		}

		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails user = new User(username, userVO.getPwd(), roles);
		return user;
	}

}
