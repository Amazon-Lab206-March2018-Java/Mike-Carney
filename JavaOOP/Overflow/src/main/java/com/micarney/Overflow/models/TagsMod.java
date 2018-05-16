package com.micarney.Overflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tags")
public class TagsMod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(max = 255, message = "Maximum 3 tags per question")
	private String tag;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "quest_tags",
			joinColumns = @JoinColumn(name = "quest_id"),
			inverseJoinColumns = @JoinColumn(name = "tag_id")
			)
	
	private List<QuestionsMod> questions;
	
	public TagsMod() {
		
	}
	public TagsMod(String tag) {
		this.tag = tag;
		
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<QuestionsMod> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionsMod> questions) {
		this.questions = questions;
	}
	public void updateQuestions(QuestionsMod quest) {
		if (this.questions.contains(quest)) {
			this.questions.remove(quest);
		}
		else if (!this.questions.contains(quest)) {
			this.questions.add(quest);
		}
		
	}
	
	
	

}
