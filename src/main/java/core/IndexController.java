package core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class IndexController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	/*
	@GetMapping("/hi")
	public String procesarForm(HttpServletRequest req,Model model) {
		String nombre = req.getParameter("usuario");
		nombre+=" alto Crack";
		model.addAttribute("nombre",nombre);
		return "hola";
	}*/
	
	
	@GetMapping("/hi")
	public String procesarForm(@RequestParam("usuario") String nombre,Model model) {
		nombre+=" alto Crack";
		model.addAttribute("nombre",nombre);
		return "hola";
	}
}
