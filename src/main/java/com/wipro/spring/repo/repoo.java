package com.wipro.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.wipro.spring.dao.Userdetail;



public interface repoo extends CrudRepository<Userdetail, String> {
	

	   Userdetail findByUname(String uname);

	     

	    @Query("SELECT e FROM Userdetail e WHERE e.uname = :uname")

	   public Userdetail listItemsWithuser(@Param("uname") String uname);
	    
	    @Query("SELECT e FROM Userdetail e WHERE e.psw = :psw")

		   public Userdetail psw(@Param("psw") String psw);

	}



