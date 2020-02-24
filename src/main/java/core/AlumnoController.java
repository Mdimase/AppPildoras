package core;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@GetMapping("/muestra")
	public String muestraFormulario(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("alumno",alumno);
		return "alumnoRegistro";
	}
	
	@PostMapping("/alumnoRegistro")
	public String alumnoRegistro(@ModelAttribute("alumno")Alumno alumno) {
		System.out.println(alumno.getApellido()+alumno.getNombre()+alumno.getIdioma()+alumno.getOptativa()+alumno.getSede()+alumno.isExtranjero());
		return "bienvenidoAlumno";
	}
}
