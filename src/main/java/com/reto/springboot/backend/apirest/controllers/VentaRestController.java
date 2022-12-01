package com.reto.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reto.springboot.backend.apirest.models.entity.Cliente;
import com.reto.springboot.backend.apirest.models.entity.Producto;
import com.reto.springboot.backend.apirest.models.entity.Venta;
import com.reto.springboot.backend.apirest.models.services.IClienteService;
import com.reto.springboot.backend.apirest.models.services.IVentaService;

//@CrossOrigin(origins = { "http://localhost:4200", "*" })
@CrossOrigin(origins = { "*", "*" })
@RestController
@RequestMapping("/api")
public class VentaRestController {

	@Autowired
	private IVentaService ventaService;

	@GetMapping("/ventas")
	public List<Venta> index() {
		return ventaService.findAll();
	}

	@GetMapping("/ventas/page/{page}")
	public Page<Venta> index(@PathVariable Integer page) {
		Pageable pageable = PageRequest.of(page, 4);
		return ventaService.findAll(pageable);
	}
	
	@GetMapping("/ventas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Venta show(@PathVariable Long id) {
		return ventaService.findById(id);
	}


}
