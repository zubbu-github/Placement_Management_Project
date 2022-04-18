package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository {
	
	//Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	public UserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	// Create operation - User Repo/DAO
	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}
	
	@Override
	public User deleteUser(User user) {
		entityManager.remove(user);
		return user;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void commitTrasaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean logout(boolean user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}