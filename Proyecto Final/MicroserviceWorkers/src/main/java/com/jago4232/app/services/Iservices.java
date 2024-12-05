package com.jago4232.app.services;

import java.util.List;
import com.jago4232.app.entities.Workers;

public interface Iservices {
	boolean insert(Workers worker);
	List<Workers> getAll();

}
