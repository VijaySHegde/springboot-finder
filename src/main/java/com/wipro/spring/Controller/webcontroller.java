package com.wipro.spring.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.wipro.spring.dao.User;
import com.wipro.spring.dao.Userdetail;
import com.wipro.spring.repo.repo;
import com.wipro.spring.repo.repoo;



@Controller
@CrossOrigin(origins="localhost:8999")
public class webcontroller {
	@Autowired
      repoo rep;
	@Autowired
	  repo rep1;
	
    @RequestMapping("/finder")
    public String loginpage() {
    	
        return "index.html";
    }
  

@RequestMapping(path="/login")
    public String currency(@RequestParam(required = true) String uname,@RequestParam(required = true) String psw) {
		System.out.println(uname.toString());
		Userdetail e;
		Userdetail u=rep.listItemsWithuser(uname.toString());
		Userdetail p=rep.psw(psw.toString());
		System.out.println(u);
		System.out.println(p);
		if((u!=null) && (p!=null))
		{
	    return "home.html"; 
		}
		else
		{
		return "failure.html";
		}		
	}
	@RequestMapping(path="/find")
	  public String find(@RequestParam(required = true) String eid,Model model)
	  {
		 System.out.println(eid);
		User emp= rep1.findByeid(eid);
		System.out.println(rep1.findByeid(eid));
	    model.addAttribute("empl", emp);
	   
		return "user.html";
		
	  }
	  }
	


