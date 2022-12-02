package com.reto.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.reto.springboot.backend.apirest.models.entity.Cliente;
import com.reto.springboot.backend.apirest.models.entity.Producto;
import com.reto.springboot.backend.apirest.models.entity.Venta;

public interface IVentaService {

	public List<Venta> findAll();

	public Page<Venta> findAll(Pageable pageable);
	
	public Venta findById(Long id);


}
