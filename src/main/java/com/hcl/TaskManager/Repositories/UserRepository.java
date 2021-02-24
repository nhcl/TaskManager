package com.hcl.TaskManager.Repositories;

import com.hcl.TaskManager.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUsername(String username);

}