package com.jago4232.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jago4232.app.datasource.WorkersRepository;
import com.jago4232.app.entities.Workers;


@Service
public class ServicesImpl implements Iservices {
	@Autowired
	private WorkersRepository repository;

	@Override
	public boolean insert(Workers worker) {
		return repository.insert(worker);
	}

	@Override
	public List<Workers> getAll() {
		return repository.getAll();
	}

}
