package com.hcl.TaskManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.hcl.TaskManager.Model.Task;
import com.hcl.TaskManager.Repositories.TaskRepository;
import com.hcl.TaskManager.Repositories.UserRepository;
import com.hcl.TaskManager.Service.TaskService;

@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TaskDataTest {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	 @Autowired
	 private TaskService taskService;
	 
	 @Test
	 public void addTask_thenReturnTask() {
		 Task task = new Task();
		 task.setName("Task 1");
		 task.setEmail("myemail@mail.com");
		 task.setSeverity("High");
		 task.setDescription("This is the task");
		 task.setUser(userRepository.findById(1L).get());
		 
		 //taskService.createTask(task);
		 
	 }

}
