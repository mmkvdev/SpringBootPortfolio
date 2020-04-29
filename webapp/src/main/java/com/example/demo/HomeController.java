package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(robot r) {
		//HttpSession session = req.getSession();
		// String name=req.getParameter("name");
		ModelAndView mv = new ModelAndView();
		// System.out.println("name is: " + myName);
		// session.setAttribute("name", myName);
		mv.addObject("obj", r);
		mv.setViewName("home");
		return mv;
	}

}
