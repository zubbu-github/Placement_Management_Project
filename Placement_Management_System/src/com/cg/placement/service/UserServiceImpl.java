package com.cg.placement.service;

import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.UserRepositoryImpl;

public  class UserServiceImpl implements IUserService
{
	// Step 1: Establishing connection between Service and Repo
	private IUserRepository dao;
	public UserServiceImpl() 
	{
		dao = new UserRepositoryImpl();
	}
	
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}
	
       @Override
		public User login(User user) {
		dao.beginTransaction();
		dao.login(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public boolean logOut() {
		dao.beginTransaction();
		dao.logout(false);
		dao.commitTrasaction();
		return false;
	}
	
	}
	
