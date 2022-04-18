package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRepository;


public class CollegeServiceImpl implements ICollegeService {

	// Step 2: Establishing connection between Service and Repository
	private ICollegeRepository dao;
	public CollegeServiceImpl() {
		dao = new CollegeRepositoryImpl();
	}
	
	// Step 3: Service calls to perform CRUD Operation
	@Override
	public College addCollege(College college) {
		  dao.beginTransaction();
	      dao.addCollege(college);
	      dao.commitTransaction();
			return college;
	}		

	@Override
	public College updateCollege(College college) {
		 dao.beginTransaction();
	      dao.updateCollege(college);
	      dao.commitTransaction();
			return college;
	}

	@Override
	public College searchCollegeById(int id) {
		College college = dao.searchCollegeById(id);
		return college;
	}

	@Override
	public College deleteCollegeById(int id) {
		College college = dao.deleteCollegeById(id);
		return college;
	}

}
