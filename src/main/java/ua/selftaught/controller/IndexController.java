package ua.selftaught.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(@Param("name") String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
	
}
