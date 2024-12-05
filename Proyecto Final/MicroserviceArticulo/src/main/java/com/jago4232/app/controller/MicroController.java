package com.jago4232.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jago4232.app.entities.Articulo;
import com.jago4232.app.services.IServices;

@RestController
@RequestMapping("/Articulo") //http://ip:port/Articulo
public class MicroController {
	
	@Autowired
	private IServices servicio;
	
	@PostMapping //POST --> http://ip:port/item
	public ResponseEntity<String> insert(@RequestBody Articulo articulo){
		if(servicio.insert(articulo))
		return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		
		return new ResponseEntity<String>("NOT Ok", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping //GET --> http://ip:port/item
	public ResponseEntity<List<Articulo>> get(){
		
		return new ResponseEntity<List<Articulo>>(servicio.getAll(), HttpStatus.OK);
		
	}

}
