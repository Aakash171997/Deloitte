package com.bookflix.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookflix.dao.UsersDAO;
import com.bookflix.models.Users;
import com.bookflix.services.AddUserService;

@Service
public class AddUserServiceImpl implements AddUserService {
	@Autowired
	UsersDAO userDAO;

	@Override
	public boolean addUser(Users user) {
		// TODO Auto-generated method stub
		Users user1 = userDAO.findByeMail(user.geteMail());
		if(user1 != null)
		{
			
			return false;

			
			
		}
		else
		{
			userDAO.save(user);
			return true;
									
		}
	}
	

}
