package core;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		//objeto encargado de tranformar una caja de texto con espacios en blancos a null
		StringTrimmerEditor recorteBlancos = new StringTrimmerEditor(true);
		
		//creo el recorte de balncos
		binder.registerCustomEditor(String.class, recorteBlancos);
	}
	
	@GetMapping("/muestra")
	public String muestraFormulario(Model model) {
		Alumno alumno = new Alumno();
		model.addAttribute("alumno",alumno);
		return "alumnoRegistro";
	}
	/*
	@PostMapping("/alumnoRegistro")
	public String alumnoRegistro(@ModelAttribute("alumno")Alumno alumno) {
		System.out.println(alumno.getApellido()+alumno.getNombre()+alumno.getIdioma()+alumno.getOptativa()+alumno.getSede()+alumno.isExtranjero());
		if(alumno.getIdioma() == null|| alumno.getSede() == null) {
			alumno.setApellido(null);
			alumno.setNombre(null);
			alumno.setIdioma(null);
			alumno.setOptativa(null);
			alumno.setSede(null);
			return "alumnoRegistro";
		}
		return "bienvenidoAlumno";
	}
	*/
	@PostMapping("/alumnoRegistro")
	public String alumnoRegistro(@Valid @ModelAttribute("alumno")Alumno alumno,BindingResult result) {
		System.out.println(alumno.getApellido()+alumno.getNombre()+alumno.getIdioma()+alumno.getOptativa()+alumno.getSede()+alumno.isExtranjero()+alumno.getEdad()+alumno.getEmail());
		if(result.hasErrors()) {
			return "alumnoRegistro";
		}else {
			return "bienvenidoAlumno";
		}
		
	}
}
