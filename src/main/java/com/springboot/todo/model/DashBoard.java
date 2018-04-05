package com.springboot.todo.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * DashBoard is a POJO class that contains all the information about a dashboard
 * basic info, todos
 * 
 * @author isriniva
 *
 */
@Document(collection = "dashboards")
public class DashBoard {

	@Id
	private String id;

	private String name;
	private String[] users;
	private List<Todo> todo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getUsers() {
		return users;
	}

	public void setUsers(String[] users) {
		this.users = users;
	}

	public List<Todo> getTodo() {
		return todo;
	}

	public void setTodo(List<Todo> todo) {
		this.todo = todo;
	}

}
