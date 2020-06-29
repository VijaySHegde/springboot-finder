package com.wipro.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.spring.dao.User;


@Repository("User")
public interface repo extends CrudRepository<User, String> {

	User findByeid(String eid);
}
