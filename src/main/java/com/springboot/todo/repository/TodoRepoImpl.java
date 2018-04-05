package com.springboot.todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.springboot.todo.model.DashBoard;

/**
 * TodoRepoImpl is an interface that extends an interface for Mongo database
 * which contains all the basic CRUD operations using MONGO DB
 * 
 * @author isriniva
 *
 */
@Repository
public interface TodoRepoImpl extends MongoRepository<DashBoard, String> {

	/**
	 * Method declaration to get DashBoard by field 'NAME'
	 * 
	 * @param name
	 * @return
	 */
	public DashBoard findByName(String name);
}