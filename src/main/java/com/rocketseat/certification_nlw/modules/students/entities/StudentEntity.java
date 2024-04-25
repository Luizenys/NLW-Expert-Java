package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

public class StudentEntity {
	private UUID id;
	private String email;
	private List<CertificationStudentEntity> certificationStudentEntity;
	
	public StudentEntity() {
	}
	
	public StudentEntity(UUID id, String email, List<CertificationStudentEntity> certificationStudentEntity) {
		this.id = id;
		this.email = email;
		this.certificationStudentEntity = certificationStudentEntity;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<CertificationStudentEntity> getCertificationStudentEntity() {
		return certificationStudentEntity;
	}

	public void setCertificationStudentEntity(List<CertificationStudentEntity> certificationStudentEntity) {
		this.certificationStudentEntity = certificationStudentEntity;
	}
	
}
