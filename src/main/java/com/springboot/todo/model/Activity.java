package com.springboot.todo.model;

/**
 * Activity is a POJO class that contains information about various activities
 * in a todo list
 * 
 * @author isriniva
 *
 */
public class Activity {

	private String commentId;
	private String comment;
	private String postedBy;

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
