package com.wipro.spring.dao;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Userdetail 
{
    @Id
    private String uname;
    private String psw;
	public Userdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetail(String uname, String psw) {
		super();
		this.uname = uname;
		this.psw = psw;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	@Override
	public String toString() {
		return "Userdetail [uname=" + uname + ", psw=" + psw + "]";
	}
	
}
