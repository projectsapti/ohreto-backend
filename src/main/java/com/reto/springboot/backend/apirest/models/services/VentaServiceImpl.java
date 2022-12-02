package com.reto.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reto.springboot.backend.apirest.models.dao.IClienteDao;
import com.reto.springboot.backend.apirest.models.dao.IProductoDao;
import com.reto.springboot.backend.apirest.models.dao.IVentaDao;
import com.reto.springboot.backend.apirest.models.entity.Cliente;
import com.reto.springboot.backend.apirest.models.entity.Producto;
import com.reto.springboot.backend.apirest.models.entity.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaDao ventaDao;


	@Override
	@Transactional(readOnly = true)
	public List<Venta> findAll() {
		return (List<Venta>) ventaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Venta> findAll(Pageable pageable) {
		return ventaDao.findAll(pageable);
	}
	

	@Override
	@Transactional(readOnly = true)
	public Venta findById(Long id) {
		return ventaDao.findById(id).orElse(null);
	}



}
