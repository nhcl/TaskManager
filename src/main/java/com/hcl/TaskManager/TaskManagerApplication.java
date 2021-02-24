package com.hcl.TaskManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.TaskManager.Model.Task;
import com.hcl.TaskManager.Model.User;
import com.hcl.TaskManager.Repositories.TaskRepository;
import com.hcl.TaskManager.Repositories.UserRepository;

@SpringBootApplication
public class TaskManagerApplication{ //implements CommandLineRunner{
	
	/*
	 * @Autowired private UserRepository userRepository;
	 * 
	 * @Autowired private TaskRepository taskRepository;
	 */

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * userRepository.save(new User("sf@gmail.com", "Sara S", "123"));
	 * taskRepository.save(new Task("Sara S", null, null, "This is the task",
	 * "sf@gmail.com", "High"));
	 * 
	 * }
	 */
}
