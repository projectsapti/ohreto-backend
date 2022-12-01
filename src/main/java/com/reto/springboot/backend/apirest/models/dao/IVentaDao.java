package com.reto.springboot.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.reto.springboot.backend.apirest.models.entity.Venta;

public interface IVentaDao extends JpaRepository<Venta, Long>{

}
