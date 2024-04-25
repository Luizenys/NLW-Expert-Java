package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.UUID;

public class AnswersCertificationsEntity {
	private UUID id;
	private UUID certificationID;
	private UUID studentID;
	private UUID questionID;
	private UUID answerID;
	private boolean isCorrect;
	
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
