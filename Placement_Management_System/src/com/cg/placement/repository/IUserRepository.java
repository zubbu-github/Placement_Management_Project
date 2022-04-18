package com.cg.placement.repository;

import com.cg.placement.entities.User;

public interface IUserRepository 
{

	public User addNewUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);
	public User login(User user);
	public boolean  logout(boolean user);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	User deleteUser(User user);
	
	
}
