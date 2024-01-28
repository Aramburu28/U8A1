package com.example.U8A1.repository;

import com.example.U8A1.dto.PersonDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonRepositoryImpl implements PersonRepository {

	@Override
	public void persist(final PersonDTO personDTO) {
		// implementation of persisting to database
	}
}