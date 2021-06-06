package com.abbu.buskes.Insurance;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface VehicleInsuranceRepository  extends CrudRepository<VehicleInsuranceEntity, Long>{
	
	
	@Query("SELECT i FROM VehicleInsuranceEntity i where i.id=?1")
	VehicleInsuranceEntity getVehicleDataById(Long id);
	
	@Modifying
	@Query("DELETE from VehicleInsuranceEntity i where i.id=?1 ")
	void deleteVehicleById(Long id);

	
	
}
