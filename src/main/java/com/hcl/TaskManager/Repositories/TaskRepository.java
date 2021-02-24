package com.hcl.TaskManager.Repositories;

import com.hcl.TaskManager.Model.Task;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>  {
	public List<Task> findByNameAndEmail(String name, String email);
	public Optional<Task> findById(Long Id);

}
