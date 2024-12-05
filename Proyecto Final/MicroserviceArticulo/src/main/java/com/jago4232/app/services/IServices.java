package com.jago4232.app.services;

import java.util.List;

import com.jago4232.app.entities.Articulo;

public interface IServices {
	boolean insert(Articulo articulo);
	List<Articulo> getAll();

}
