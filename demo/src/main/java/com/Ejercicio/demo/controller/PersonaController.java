package com.Ejercicio.demo.controller;

import java.util.ArrayList;

import com.Ejercicio.demo.Services.PersonaService;
import com.Ejercicio.demo.model.PersonaModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping()
    public ArrayList<PersonaModel> listarPersonas(){
        return personaService.ListarPersonas();
    }
    @PostMapping()
    public PersonaModel RegistrarPersona(@RequestBody PersonaModel persona){
     return this.personaService.RegistrarPersona(persona);
    }
}
