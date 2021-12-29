package com.juansaldana.personaswebhibernatejpa.web;

import com.juansaldana.personaswebhibernatejpa.ServicioPersonas;
import com.juansaldana.personaswebhibernatejpa.domain.Persona;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServicioPersonas servicioPersonas = new ServicioPersonas();
        //Solicitar el listado de personas
        List<Persona> personas = servicioPersonas.listarPersonas();
        request.setAttribute("personas", personas);
        try {
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
