package edu.practice.employee_api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@RequestMapping("/employee")
@Controller
public class IndexPageController
{
	@GetMapping("/")
	public String bruh(Model model)
	{
		//model.addAttribute("name", name);
		return "index";
	}
}
