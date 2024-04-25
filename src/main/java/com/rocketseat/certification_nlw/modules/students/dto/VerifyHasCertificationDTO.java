package com.rocketseat.certification_nlw.modules.students.dto;

public class VerifyHasCertificationDTO {

	private String email;
	private String technology;
	
	public VerifyHasCertificationDTO() {
	}
	
	public VerifyHasCertificationDTO(String email, String technology) {
		this.email = email;
		this.technology = technology;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
}
