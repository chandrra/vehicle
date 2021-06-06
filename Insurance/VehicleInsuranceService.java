package com.abbu.buskes.Insurance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleInsuranceService {
	
	@Autowired
	public VehicleInsuranceRepository vehicleInsuranceRepository;
	
	public VehicleInsuranceEntity add(VehicleInsuranceEntity ve) {
		return vehicleInsuranceRepository.save(ve);
	}
	public List<VehicleInsuranceEntity> getData(){
		List<VehicleInsuranceEntity> vie1=new ArrayList<VehicleInsuranceEntity>();
		 vehicleInsuranceRepository.findAll().forEach(vie1::add);
		 return vie1 ;
	}
	
	public VehicleInsuranceEntity getVDataById(Long id) {
		return vehicleInsuranceRepository.getVehicleDataById(id);
	}
	
	public void deleteVehicleById(Long Id) {
		vehicleInsuranceRepository.deleteVehicleById(Id);
		
	}

}
