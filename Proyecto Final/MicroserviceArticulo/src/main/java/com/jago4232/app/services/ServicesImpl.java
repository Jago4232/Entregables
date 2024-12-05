package com.jago4232.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jago4232.app.datasource.ArticuloRepository;
import com.jago4232.app.entities.Articulo;

@Service
public class ServicesImpl implements IServices {
	@Autowired
	private ArticuloRepository repository;

	@Override
	public boolean insert(Articulo articulo) {
		return repository.insert(articulo);
	}

	@Override
	public List<Articulo> getAll() {
		return repository.getAll();
	}
	

}
