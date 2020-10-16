package com.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "request100")
public class RequesterModel {
	@Id
	private Integer rId;
	@NotEmpty
	private String patientName;
	@NotEmpty
	private String requiredBlood;
	@NotEmpty
	private String city;
	@NotEmpty
	private String doctorName;
	@NotEmpty
	private String hospitalNameAddress;
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date date;

	@NotEmpty
	private String contactName;
	@NotNull
	private Long contactNumber;
	@NotEmpty
	@Email
	private String emailId;
	@NotEmpty
	private String message;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getRequiredBlood() {
		return requiredBlood;
	}

	public void setRequiredBlood(String requiredBlood) {
		this.requiredBlood = requiredBlood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getHospitalNameAddress() {
		return hospitalNameAddress;
	}

	public void setHospitalNameAddress(String hospitalNameAddress) {
		this.hospitalNameAddress = hospitalNameAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
