package com.bookflix.services.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookflix.dao.UsersDAO;
import com.bookflix.models.Login;
import com.bookflix.models.Users;
import com.bookflix.services.LoginDetailsService;
@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {
	@Autowired
	UsersDAO userDAO;
	
	@Autowired
	HttpSession httpSession;
	
	@Override
	public boolean validateuser(Login login) {
		
		Users user1 = userDAO.findByeMail(login.geteMail());
		System.out.println(login.geteMail());
		System.out.println(login.getPassword());
		if(user1 == null)
		{
			return false ;
			
		}
		else if(user1.getPassword().equals(login.getPassword()))
		{
		    httpSession.setAttribute("sessionStatus", "on");
		    httpSession.setAttribute("userId", (Integer) user1.getUserId());
			return true;
			
		}
		else
		{
			
			return false;
			
		}
	
	
		
	}

}
