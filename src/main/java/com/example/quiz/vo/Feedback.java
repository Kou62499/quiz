package com.example.quiz.vo;

import java.time.LocalDateTime;

public class Feedback {

	private String userName;

	private LocalDateTime fillinDateTime;

	private FeedbackDetail feebackDetail;

	public Feedback() {
		super();
	}

	public Feedback(String userName, LocalDateTime fillinDateTime, FeedbackDetail feebackDetail) {
		super();
		this.userName = userName;
		this.fillinDateTime = fillinDateTime;
		this.feebackDetail = feebackDetail;
	}

	public String getUserName() {
		return userName;
	}

	public LocalDateTime getFillinDateTime() {
		return fillinDateTime;
	}

	public FeedbackDetail getFeebackDetail() {
		return feebackDetail;
	}

}
