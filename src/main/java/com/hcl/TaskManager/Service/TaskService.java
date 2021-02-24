package com.hcl.TaskManager.Service;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.TaskManager.Exceptions.TaskNotFoundException;
import com.hcl.TaskManager.Model.Task;
import com.hcl.TaskManager.Model.User;
import com.hcl.TaskManager.Repositories.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Iterable<Task> getAllTasks(){
		return taskRepository.findAll();
	}

	public Optional<Task> getTaskById(Long Id) {
		return taskRepository.findById(Id);
	}
	
	public Task createTask(String taskName, Date startDate, Date endDate, String description, String email, String severity) {
		Task task = new Task();
		task.setName(taskName);
		task.setStartDate(startDate);
		task.setEndDate(endDate);
		task.setDescription(description);
		task.setEmail(email);
		task.setSeverity(severity);
		//task.setUser(user);
		return taskRepository.save(task);
	}
	
	public Boolean updateTask(Long id, String taskName, Date startDate, Date endDate, String description, String email, String severity) {
		//List<Task> list = taskRepository.findByNameAndEmail(taskName, email);
		Optional<Task> found = taskRepository.findById(id);
		if(found.isEmpty()) {
			throw new TaskNotFoundException(id);
			//return false;
		}
		else {
			Task task = found.get();
	
			task.setStartDate(startDate);
			task.setEndDate(endDate);
			task.setDescription(description);
			task.setSeverity(severity);
			task.setEmail(email);
			task.setName(taskName);
			//task.setUser(user);
			taskRepository.save(task);
			return true;
		}
	}
	
	public Boolean FindTaskById(Long id) {
		Optional<Task> found = taskRepository.findById(id);
		if(found.isEmpty()) {
			throw new TaskNotFoundException(id);
			//return false;
		}
		else {
			return true;
		}
	}
	
	public Boolean deleteTask(Long id) {
		Optional<Task> found = taskRepository.findById(id);
		if(found.isEmpty()) {
			throw new TaskNotFoundException(id);
			//return false;
		}
		else {
			taskRepository.delete(found.get());
			return true;
		}
	}
}
