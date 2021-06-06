package com.abbu.buskes.Insurance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/vi")
public class VehicleInsurenceController {

	@Autowired
	public VehicleInsuranceService viService;

	// get All vehicleinsurenceList
	@GetMapping("/vehicles")
	public List<VehicleInsuranceEntity> getAllVinsurances() {
		return viService.getData();

	}

	// getData By Id

	@GetMapping("/vehicles/{id}")
	public ResponseEntity<VehicleInsuranceEntity> getVdataById(@PathVariable Long id) {

		VehicleInsuranceEntity ve = viService.getVDataById(id);
		// .orElseThrow(() -> new ResourceNotFoundException("vehicle withat id not
		// found:"+id));

		if (ve.equals(null)) {
			System.out.println("no data with that id..:" + id);
		}
		return ResponseEntity.ok(ve);

	}

	// add/create vehicle
	@PostMapping("/add-vehicles")
	public VehicleInsuranceEntity createvInsurance(@RequestBody VehicleInsuranceEntity vie) {
		return viService.add(vie);
	}

	// update vehicle insurance
	@PutMapping("/vehicles/{id}")
	public ResponseEntity<VehicleInsuranceEntity> updateVinsurance(@PathVariable Long id,
			@RequestBody VehicleInsuranceEntity vdetails) {
		VehicleInsuranceEntity vie = viService.getVDataById(id);
		
		  if(vie==null) { ResponseEntity.noContent();
		      System.out.println("no da with that id:"+id); 
		      }
		  
		 vie.setVehicle_id(vdetails.getVehicle_id());
		vie.setVehicle_name(vdetails.getVehicle_name());
		vie.setVehicle_regdate(vdetails.getVehicle_regdate());
		vie.setVehicle_regno(vdetails.getVehicle_regno());
		vie.setAddress(vdetails.getAddress());
		vie.setBank_accno(vdetails.getBank_accno());
		vie.setBank_name(vdetails.getBank_name());
		vie.setCustomer_name(vdetails.getCustomer_name());
		vie.setEmail_id(vdetails.getEmail_id());
		vie.setInsurance_date(vdetails.getInsurance_date());
		vie.setMobileno(vdetails.getMobileno());

		VehicleInsuranceEntity updatedVie = viService.add(vie);
		return ResponseEntity.ok(updatedVie);
	}

	// delete empbyid
	@DeleteMapping("/vehicles/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteVehicle(@PathVariable Long id) {
		VehicleInsuranceEntity ve = viService.getVDataById(id);
		if (ve == null) {
			ResponseEntity.noContent();
			System.out.println("vehicle id is not exist..." + id);
		}
		viService.deleteVehicleById(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted employee id:" + id, Boolean.TRUE);
		return ResponseEntity.ok(response);

	}

}
