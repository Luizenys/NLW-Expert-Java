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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "certifications")
public class CertificationStudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(length = 100)
	private String technology;
	
	@Column(length = 10)
	private int grade;
	
	@JoinColumn(name = "student_id")
	private UUID studentID;
	
	@ManyToOne
	@JoinColumn(name = "student_id", insertable = false, updatable = false)
	private StudentEntity studentEntity;
	
	@OneToMany
	@JoinColumn(name = "answer_certification_id", insertable = false, updatable = false)
	List<AnswersCertificationsEntity> answersCertificationsEntity;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	public CertificationStudentEntity() {
	}
	
	public CertificationStudentEntity(UUID id, UUID studentID, String technology, int grade,
			List<AnswersCertificationsEntity> answersCertificationsEntity) {
		this.id = id;
		this.studentID = studentID;
		this.technology = technology;
		this.grade = grade;
		this.answersCertificationsEntity = answersCertificationsEntity;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getStudentID() {
		return studentID;
	}

	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public List<AnswersCertificationsEntity> getAnswersCertificationsEntity() {
		return answersCertificationsEntity;
	}

	public void setAnswersCertificationsEntity(List<AnswersCertificationsEntity> answersCertificationsEntity) {
		this.answersCertificationsEntity = answersCertificationsEntity;
	}
	
}
