package com.alberto.proyecto.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.alberto.proyecto.entidad.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{

}
