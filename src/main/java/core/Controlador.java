package core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
	
	@GetMapping("/ejemplo")
	public String muestraPagina() {
		return "Ejemplo";
	}
}
