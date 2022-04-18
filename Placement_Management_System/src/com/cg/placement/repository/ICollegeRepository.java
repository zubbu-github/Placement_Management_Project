package com.cg.placement.repository;

import com.cg.placement.entities.College;

public interface ICollegeRepository {

	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollegeById(int id);
	public College deleteCollegeById(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
