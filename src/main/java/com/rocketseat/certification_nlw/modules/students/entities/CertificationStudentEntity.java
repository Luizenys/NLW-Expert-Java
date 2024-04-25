package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.List;
import java.util.UUID;

public class CertificationStudentEntity {
	private UUID id;
	private UUID studentID;
	private String technology;
	private int grade;
	List<AnswersCertificationsEntity> answersCertificationsEntity;
	
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
