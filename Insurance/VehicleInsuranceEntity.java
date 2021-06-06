package com.abbu.buskes.Insurance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_insurance_tbl")
public class VehicleInsuranceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	private String vehicle_id;
	private String vehicle_name;
	private String vehicle_regno;
	private Date vehicle_regdate;
	private String customer_name;
	private String mobileno;
	private String address;
	private String email_id;
	private String bank_name;
	private String bank_accno;
	private Date insurance_date;
	
	public VehicleInsuranceEntity() {
		
	}
	
	
	
	
	public VehicleInsuranceEntity(Long id, String vehicle_id, String vehicle_name, String vehicle_regno,
			Date vehicle_regdate, String customer_name, String mobileno, String address, String email_id,
			String bank_name, String bank_accno, Date insurance_date) {
		super();
		this.id = id;
		this.vehicle_id = vehicle_id;
		this.vehicle_name = vehicle_name;
		this.vehicle_regno = vehicle_regno;
		this.vehicle_regdate = vehicle_regdate;
		this.customer_name = customer_name;
		this.mobileno = mobileno;
		this.address = address;
		this.email_id = email_id;
		this.bank_name = bank_name;
		this.bank_accno = bank_accno;
		this.insurance_date = insurance_date;
	}




	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getVehicle_regno() {
		return vehicle_regno;
	}
	public void setVehicle_regno(String vehicle_regno) {
		this.vehicle_regno = vehicle_regno;
	}
	public Date getVehicle_regdate() {
		return vehicle_regdate;
	}
	public void setVehicle_regdate(Date vehicle_regdate) {
		this.vehicle_regdate = vehicle_regdate;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBank_accno() {
		return bank_accno;
	}
	public void setBank_accno(String bank_accno) {
		this.bank_accno = bank_accno;
	}
	public Date getInsurance_date() {
		return insurance_date;
	}
	public void setInsurance_date(Date insurance_date) {
		this.insurance_date = insurance_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
