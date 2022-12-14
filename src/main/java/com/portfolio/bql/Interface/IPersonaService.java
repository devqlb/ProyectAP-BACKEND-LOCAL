package com.portfolio.bql.Interface;

import com.portfolio.bql.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por ID
    public void deletePersona(Long Id);

    //Buscar una persona por ID
    public Persona findPersona(Long id);

}
