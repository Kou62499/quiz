package com.example.quiz.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fillin {

	// question_id
	@JsonProperty("question_id")
	private int qId;

	private String question;

	// �h�ӿﶵ�O�Τ���(;)�걵
	private String options;
	
	// �h�ӵ��׬O�Τ���(;)�걵
	private String answer;

	private String type;

	private boolean necessary;

	public Fillin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fillin(int qId, String question, String options, String answer, String type, boolean necessary) {
		super();
		this.qId = qId;
		this.question = question;
		this.options = options;
		this.answer = answer;
		this.type = type;
		this.necessary = necessary;
	}

	public int getqId() {
		return qId;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String getType() {
		return type;
	}

	public boolean isNecessary() {
		return necessary;
	}

	public String getOptions() {
		return options;
	}

}