package com.rocketseat.certification_nlw.modules.students.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "students")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(unique = true, nullable = false, length = 100)
	private String email;
	
	@OneToMany(mappedBy = "studentEntity")
	private List<CertificationStudentEntity> certificationStudentEntity;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
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
