package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.PlacementRepoImpl;
import com.cg.placement.repository.IPlacementRepository;

public class PlacementServiceImpl implements IPlacementService {

	   // Step 2: Establishing connection between Service and Repository
		private IPlacementRepository dao;
		
		public PlacementServiceImpl() {
			dao = new PlacementRepoImpl();
			
		}
		
		// Step 3: Service calls to perform CRUD Operation
		@Override
		public Placement addPlacement(Placement placement) {
			dao.beginTransaction();
			dao.addPlacement(placement);
			dao.commitTrasaction();
			return placement;
			}

		@Override
		public Placement updatePlacement(Placement placement) {
			dao.beginTransaction();
			dao.updatePlacement(placement);
			dao.commitTrasaction();
			return placement;
		}

		@Override
		public Placement searchPlacementById(int id) {
			Placement placement = dao.searchPlacementById(id);
			return placement;
		}

		@Override
		public Placement cancelPlacement(Placement placement) {
			dao.beginTransaction();
			 dao.cancelPlacement(placement);
			dao.commitTrasaction();
			return placement;
		}
}
