package com.alberto.proyecto.servicio;

import java.util.List;

import com.alberto.proyecto.entidad.Producto;

public interface ProductoService {
	
	public List<Producto> listarTodos();

	public void grabar(Producto producto);

	public Producto buscarPorId(Long id);

	public void eliminar(Long id);
	
}
