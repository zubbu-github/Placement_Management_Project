package com.cg.placement.repository;

import javax.persistence.EntityManager;
import com.cg.placement.entities.College;
	
	public class CollegeRepositoryImpl implements ICollegeRepository {

		//Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public CollegeRepositoryImpl() {
			entityManager = JPAUtil.getEntityManager();
		  }
		
		// Create Operation - College Repository
		@Override
		public College addCollege(College college) {
			entityManager.persist(college);
			return college;
		}
		@Override
		public College updateCollege(College college) {
			entityManager.merge(college);
			return college;
		}
		@Override
		public College searchCollegeById(int id) {
			College college	= entityManager.find(College.class, id);
			return college;
		}
		@Override
		public College deleteCollegeById(int id) {
			College college	= entityManager.find(College.class, id);
			entityManager.remove(college);
			return college;
		}
		@Override
		public void beginTransaction() {
			entityManager.getTransaction().begin();
			
		}
		@Override
		public void commitTransaction() {
			entityManager.getTransaction().commit();
			
		}
		

}
