package com.map;

import javax.persistence.*;

@Entity
@Embeddable
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private int answer_Id;
	private String answer;
	
	
	public int getAnswer_Id() {
		return answer_Id;
	}
	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int answer_Id, String answer) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
