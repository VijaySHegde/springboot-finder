package com.wipro.spring.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
 @Id
private String eid;
private String name;
private String email;
private String location;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String eid, String name, String email, String location) {
	super();
	this.eid = eid;
	this.name = name;
	this.email = email;
	this.location = location;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return " eid=" + eid + ", name=" + name + ", email=" + email + ", location=" + location + " ";
	
}



}
