package com.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "donor100")
public class DonorModel {
	@Id
	@NotNull
	private Integer pid;
	@NotEmpty

	private String time;
	@NotNull
	private Integer bgl;
	@NotEmpty
	private String notes;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getBgl() {
		return bgl;
	}

	public void setBgl(Integer bgl) {
		this.bgl = bgl;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
