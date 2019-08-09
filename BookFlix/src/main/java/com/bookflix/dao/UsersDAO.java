package com.bookflix.dao;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookflix.models.Users;

public interface UsersDAO extends CrudRepository<Users, Integer>{

	public Users findByeMail(String eMail);
	public Users findByUserId(int ownerId);
}
