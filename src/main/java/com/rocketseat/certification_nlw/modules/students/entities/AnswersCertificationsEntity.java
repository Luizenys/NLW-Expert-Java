package com.rocketseat.certification_nlw.modules.students.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "answers_certification_students")
public class AnswersCertificationsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(name = "certification_id")
	private UUID certificationID;
	
	@ManyToOne
	@JoinColumn(name = "certification_id", insertable = false, updatable = false)
	private CertificationStudentEntity certificationStudentEntity;
	
	@Column(name = "student_id")
	private UUID studentID;
	
	@ManyToOne
	@JoinColumn(name = "student_id", insertable = false, updatable = false)
	private StudentEntity studentEntity;
	
	@Column(name = "question_id")
	private UUID questionID;
	
	@Column(name = "answer_id")
	private UUID answerID;
	
	@Column(name = "is_correct")
	private boolean isCorrect;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	public AnswersCertificationsEntity() {
	}
	
	public AnswersCertificationsEntity(UUID id, UUID certificationID, UUID studentID, UUID questionID, UUID answerID,
			boolean isCorrect) {
		this.id = id;
		this.certificationID = certificationID;
		this.studentID = studentID;
		this.questionID = questionID;
		this.answerID = answerID;
		this.isCorrect = isCorrect;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getCertificationID() {
		return certificationID;
	}

	public void setCertificationID(UUID certificationID) {
		this.certificationID = certificationID;
	}

	public UUID getStudentID() {
		return studentID;
	}

	public void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}

	public UUID getQuestionID() {
		return questionID;
	}

	public void setQuestionID(UUID questionID) {
		this.questionID = questionID;
	}

	public UUID getAnswerID() {
		return answerID;
	}

	public void setAnswerID(UUID answerID) {
		this.answerID = answerID;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
}
