package com.api.rest.controller;

import java.util.logging.Logger;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.models.Model;

@RestController
public class Controller {
	private final static Logger LOG = Logger.getLogger("bitacora.subnivel.Control");
	
	@Autowired
	private Model model;
	
	@PostMapping("/Guardar")
	public String Datos(@RequestBody Model model) {
		LOG.info(model.toString());
		return model.toString();
	}
}
