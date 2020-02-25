package core;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Alumno {
		
		@NotBlank
		@Size(min=2,message="campo requerido")
		private String nombre;
		
		@NotBlank
		@Size(min=2,message="campo requerido")
		private String apellido;
		
		@NotNull
		@Min(value=8,message="no se permiten menores de 8")
		@Max(value=100,message="limite de edad 100")
		private int edad;
		
		@NotBlank
		@Email
		private String email;
		
		@Pattern(regexp="[0-9]{5}",message="solo 5 valores numericos")
		private String codigoPostal;
		
		private String optativa;
		private String sede;
		private boolean extranjero;
		private String idioma;
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getOptativa() {
			return optativa;
		}
		public void setOptativa(String optativa) {
			this.optativa = optativa;
		}
		public String getSede() {
			return sede;
		}
		public void setSede(String sede) {
			this.sede = sede;
		}
		public boolean isExtranjero() {
			return extranjero;
		}
		public void setExtranjero(boolean extranjero) {
			this.extranjero = extranjero;
		}
		public String getIdioma() {
			return idioma;
		}
		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCodigoPostal() {
			return codigoPostal;
		}
		public void setCodigoPostal(String codigoPostal) {
			this.codigoPostal = codigoPostal;
		}
		
		
}
