package com.example.U8A1.service;

import com.example.U8A1.dto.PersonDTO;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  @Override
  public boolean isValid(PersonDTO personDTO) {
    return personDTO != null
        && personDTO.getProfession() != null
        && personDTO.getProfession().equals("Software Developer");
  }
}