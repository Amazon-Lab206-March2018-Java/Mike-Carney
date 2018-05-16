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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.swing.text.html.HTML.Tag;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="questions")
public class QuestionsMod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min = 1)
	private String question;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	
	@Column
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
	private List<AnswersMod> answers;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "quest_tags",
			joinColumns = @JoinColumn(name = "quest_id"),
			inverseJoinColumns = @JoinColumn(name = "tag_id") 
			)
	
	private List<TagsMod> tags;
	
	public QuestionsMod() {
		
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

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
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

	public List<AnswersMod> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswersMod> answers) {
		this.answers = answers;
	}

	public List<TagsMod> getTags() {
		return tags;
	}

	public void setTags(List<TagsMod> tags) {
		this.tags = tags;
	}
	
	public void updateTags(TagsMod tags) {
		this.tags.add(tags);
	}
	
	public void updateAnswers(AnswersMod answers) {
		if (this.answers.contains(answers)) {
			this.answers.remove(answers);
		} 
		else if (!this.answers.contains(answers)) {
			this.answers.add(answers);
		}
	}
}
