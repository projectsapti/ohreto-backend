package com.reto.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.reto.springboot.backend.apirest.models.entity.Cliente;
import com.reto.springboot.backend.apirest.models.entity.Producto;
import com.reto.springboot.backend.apirest.models.entity.Venta;

public interface IClienteService {

	public List<Cliente> findAll();

	public Page<Cliente> findAll(Pageable pageable);

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);

	public Venta findFacturaById(Long id);

	public Venta saveFactura(Venta factura);

	public void deleteFacturaById(Long id);

	public List<Producto> findProductoByNombre(String term);

}
