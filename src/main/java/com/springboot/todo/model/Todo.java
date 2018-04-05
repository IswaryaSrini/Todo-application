package com.springboot.todo.model;

import java.util.List;
import javax.validation.constraints.Size;

/**
 * Todo is a POJO class that contains information about a todo entry basic info,
 * checklists, activities,phase,etc
 * 
 * @author isriniva
 *
 */
public class Todo {

	private String id;

	@Size(max = 100)
	private String title;

	@Size(max = 500)
	private String description;

	private List<CheckList> checkList;
	private String dueDate;
	private String createdBy;
	private String assignedTo;
	private List<Activity> activityList;
	private Phase phase;

	public enum Phase {
		DUE, INPROGRESS, BLOCK, DONE
	}

	public List<CheckList> getCheckList() {
		return checkList;
	}

	public void setCheckList(List<CheckList> checkList) {
		this.checkList = checkList;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public List<Activity> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Phase getPhase() {
		return phase;
	}

	public void setPhase(Phase phase) {
		this.phase = phase;
	}

}
