package com.carlos.springboot.app.productos.models.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carlos.springboot.app.productos.models.dao.ProductoDao;
import com.carlos.springboot.app.productos.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
