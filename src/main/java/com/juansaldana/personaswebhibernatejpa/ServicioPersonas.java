package com.juansaldana.personaswebhibernatejpa;

import com.juansaldana.personaswebhibernatejpa.dao.PersonaDAO;
import com.juansaldana.personaswebhibernatejpa.domain.Persona;

import java.util.List;

public class ServicioPersonas {
    private PersonaDAO personaDao;

    public ServicioPersonas(){
        this.personaDao = new PersonaDAO();
    }
    public List<Persona> listarPersonas(){
        return this.personaDao.listar();
    }
}
