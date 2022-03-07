package com.Ejercicio.demo.Services;

import java.util.ArrayList;

import com.Ejercicio.demo.Repositories.PersonaRepository;
import com.Ejercicio.demo.model.PersonaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    
    public ArrayList<PersonaModel> ListarPersonas(){
        return (ArrayList<PersonaModel>) personaRepository.findAll();
    } 
    public PersonaModel RegistrarPersona( PersonaModel persona){
      return personaRepository.save(persona);
    }
}
