package com.reto.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.reto.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long>{

	
}
