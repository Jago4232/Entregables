package com.jago4232.app.datasource;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.jago4232.app.entities.Workers;


@Component
public class WorkersRepository {
	private final List<Workers> lista=new ArrayList<>();

	public boolean insert(Workers item) {
		return lista.add(item);
	}
	
	public List<Workers> getAll() {
		return lista;
	}

}
