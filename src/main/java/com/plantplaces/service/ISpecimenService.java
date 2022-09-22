package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD operations for specimens
 *
 */

public interface ISpecimenService {
	
	/**
	 * Get specimens from persistence layer
	 * @param id is unique lookup
	 * @return a specimen with matching id
	 *
	 */

	SpecimenDTO fetchById(int id);
	
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);

}