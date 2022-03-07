package com.Ejercicio.demo.Repositories;

import java.util.ArrayList;

import com.Ejercicio.demo.model.PersonaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel,Long> {
    public abstract ArrayList<PersonaModel> FindbyDni(Integer dni);
}
