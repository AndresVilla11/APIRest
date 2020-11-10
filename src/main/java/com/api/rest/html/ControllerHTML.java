package com.api.rest.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerHTML {
	
	@RequestMapping(value = { "/Home", "/"}, method = RequestMethod.GET)
	public String controlDeInicio() {
		return "Home";
	}

	@RequestMapping(value = "/Crear_Persona", method = RequestMethod.POST)
	public String controlDeFormulario() {
		return "Formulario_datos";
	}

	@RequestMapping(value = "/Listar_Personas", method = RequestMethod.GET)
	public String controlDeListado() {
		return "Listar-Personas";
	}

	@RequestMapping(value = { "/Guardar" }, method = RequestMethod.GET)
	public String controlDeRetorno() {
		return "redirect:/";
	}
}
