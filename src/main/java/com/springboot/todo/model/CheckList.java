package com.springboot.todo.model;

/**
 * CheckList is a POJO class that contains the checklists to be done along with
 * its status for a Todo entry
 * 
 * @author isriniva
 *
 */
public class CheckList {

	private String subTask;
	private String checkListStatus;

	public String getSubTask() {
		return subTask;
	}

	public void setSubTask(String subTask) {
		this.subTask = subTask;
	}

	public String getCheckListStatus() {
		return checkListStatus;
	}

	public void setCheckListStatus(String checkListStatus) {
		this.checkListStatus = checkListStatus;
	}

}
