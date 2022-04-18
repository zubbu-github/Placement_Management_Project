package com.cg.placement.repository;

import com.cg.placement.entities.Placement;

public interface IPlacementRepository {

	
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacementById(int id);
	public Placement cancelPlacement(Placement placement);
	
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	void cancelPlacement(int id);
	
}