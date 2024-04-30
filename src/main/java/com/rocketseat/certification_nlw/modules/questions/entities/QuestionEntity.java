package com.rocketseat.certification_nlw.modules.questions.entities;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity(name = "questions")
public class QuestionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(length = 50)
	private String technology;
	
	private String description;
	
	@OneToMany
	@JoinColumn(name = "question_id")
	private List<AlternativesEntity> alternatives;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	public QuestionEntity() {
	}

	public QuestionEntity(UUID id, String technology, String description, List<AlternativesEntity> alternatives,
			LocalDateTime createdAt) {
		super();
		this.id = id;
		this.technology = technology;
		this.description = description;
		this.alternatives = alternatives;
		this.createdAt = createdAt;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AlternativesEntity> getAlternatives() {
		return alternatives;
	}

	public void setAlternatives(List<AlternativesEntity> alternatives) {
		this.alternatives = alternatives;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
}
