package com.hcl.TaskManager.Controller;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.TaskManager.Exceptions.TaskNotFoundException;
import com.hcl.TaskManager.Model.Task;
import com.hcl.TaskManager.Service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	TaskService taskService;
	Long UpdateId;
	
	@RequestMapping(value = "/addTaskToTable", method = RequestMethod.POST)
	public String  addTask(@RequestParam String taskName, @RequestParam Date startDate, @RequestParam Date endDate, @RequestParam String description, @RequestParam String email, @RequestParam String severity, UserController user, ModelMap model) {
		Task task = taskService.createTask(taskName, startDate, endDate, description, email, severity);
		model.put("successAdd", "Successfully Added the Task to the Database.");
		model.put("UserId", "Here is your Id number: ");
		model.put("Id", task.getId());
		return "addTask";
	}
	
	@RequestMapping(value = "/addTask", method = RequestMethod.POST)
	public String  addTask(ModelMap model) {
		return "addTask";
	}
	
	@RequestMapping(value = "/mainMenu", method = RequestMethod.POST)
	public String  mainMenu(ModelMap model) {
		return "showOptions";
	}
	
	@RequestMapping(value = "/displayTask", method = RequestMethod.POST)
	public String  displayTask(ModelMap model) {
		model.put("task", taskService.getAllTasks());
		return "displayTask";
	}
	
	@RequestMapping(value = "/deleteTask", method = RequestMethod.POST)
	public String  deleteTask(ModelMap model) {
		return "deleteTask";
	}
	
	@RequestMapping(value = "/processDeleteTask", method = RequestMethod.POST)
	public String  processDeleteTask(@RequestParam Long taskId, ModelMap model) {
		//Boolean found = taskService.deleteTask(taskId);
		try {
			taskService.deleteTask(taskId);
			model.put("deleteTaskSuccess", "Successfully Deleted the Task from the Database.");
		}
		catch(TaskNotFoundException ex) {
			model.put("deleteTaskFail", "The Task Does Not Exist. Please Try Again.");
		}
		//if(found) {
			//model.put("deleteTaskSuccess", "Successfully Deleted the Task from the Database.");
		//}
		//else {
			//model.put("deleteTaskFail", "The Task Does Not Exist. Please Try Again.");
		//}
		return "deleteTask";
	}
	
	@RequestMapping(value = "/findTaskToUpdate", method = RequestMethod.POST)
	public String  findTaskToUpdate(ModelMap model) {
		return "findTaskToUpdate";
	}
	
	@RequestMapping(value = "/processUpdateTask", method = RequestMethod.POST)
	public String  ProcessUpdateTask(@RequestParam String taskName, @RequestParam Date startDate, @RequestParam Date endDate, @RequestParam String description, @RequestParam String email, @RequestParam String severity, ModelMap model) {
		try {
			taskService.updateTask(UpdateId, taskName, startDate, endDate, description, email, severity);
			model.put("UpdateTaskSuccess", "The Task was updated Successfully.");
		}
		catch(TaskNotFoundException ex) {
			model.put("NotFoundTask", "The Task Does Not Exist. Please Try Again.");
		}
		return "findTaskToUpdate";
	}
	
	@RequestMapping(value = "/processFindTaskToUpdate", method = RequestMethod.POST)
	public String  processFindTaskToUpdate(@RequestParam Long taskId, ModelMap model) {
		UpdateId = taskId;
		//Boolean found = taskService.FindTaskById(UpdateId);
		try {
			taskService.FindTaskById(UpdateId);
		}
		catch(TaskNotFoundException ex) {
			model.put("NotFoundTask", "The Task Does Not Exist. Please Try Again.");
			return "findTaskToUpdate";
		}
		
		return "updateTask";
		//if(!found) {
			//model.put("NotFoundTask", "The Task Does Not Exist. Please Try Again.");
			//return "findTaskToUpdate";
		//}
		//else {
			//return "updateTask";
		//}	
	}
}
