package com.springboot.todo.controller;

import com.springboot.todo.model.DashBoard;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.todo.repository.TodoRepoImpl;

/**
 * Controller class to perform CRUD operations on Todo dashboard
 * 
 * @author isriniva
 *
 */
@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	private TodoRepoImpl todoRepoImpl;

	/**
	 * Retrieve all the dashboards
	 * 
	 * @return List of dashboards if retrieved from database
	 */
	@GetMapping("/all")
	public ResponseEntity<List<DashBoard>> retrieveAllTodos() {
		return new ResponseEntity<List<DashBoard>>(todoRepoImpl.findAll(), HttpStatus.OK);
	}

	/**
	 * Retrieve the dashboard by its name
	 * 
	 * @param name
	 *            the name of the dashboard
	 * @return Dashboard if the name given is already present in database
	 */
	@GetMapping("/getSingle/{name}")
	public ResponseEntity<DashBoard> retrieveTodo(@PathVariable String name) {
		return new ResponseEntity<DashBoard>(todoRepoImpl.findByName(name), HttpStatus.OK);
	}

	/**
	 * Add a dashboard based on the JSON given
	 * 
	 * @param dashboard
	 *            Dashboard object that contain all information
	 * @return Status CREATED if the post operation is success along with the
	 *         dashboard that we created
	 */
	@PostMapping("/saveSingle")
	public ResponseEntity<DashBoard> addTodo(@RequestBody DashBoard dashboard) {
		todoRepoImpl.save(dashboard);
		return new ResponseEntity<DashBoard>(dashboard, HttpStatus.CREATED);
	}
}
