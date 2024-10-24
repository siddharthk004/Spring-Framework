package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{ 
		System.out.println("this is home url");
		model.addAttribute("name","Siddharth");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about Controller");
		return "about";
	}
}
