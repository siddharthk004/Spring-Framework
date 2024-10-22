package springmvc.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/home")
	public String home()
	{ 
		System.out.println("this is home url");
		return "index";
	}
}
