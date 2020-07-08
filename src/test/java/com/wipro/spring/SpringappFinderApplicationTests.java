package com.wipro.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.wipro.spring.repo.repo;



@SpringBootTest
class SpringappFinderApplicationTests {
	@Autowired
    repo rep;

	
	 @Test
	    @Rollback(false)
	    @Order(1)
	    public void testDeleteProduct() {
	    	String emp_id = "pr20091077";
	    	
	    	boolean isExistBeforDelete = rep.findById(emp_id).isPresent();
	    	
	    	assertTrue(isExistBeforDelete);
	    	
	         
	    }
	@Test
	    @Rollback(false)
	    @Order(2)
	    public void testDelProduct() {
	    	String username = "priya";
	    
	    	boolean isExistBeforDelete = repo.findById(username).isPresent();
	    	
	    	assertTrue(isExistBeforDelete);
	    	
	         
	    }
	   
}
