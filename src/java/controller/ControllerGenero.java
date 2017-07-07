/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.GeneroDao;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelos.Genero;

/**
 *
 * @author Rodrigo
 */
@ManagedBean
public class ControllerGenero {
    
    private Genero genero;
    private GeneroDao gDao;
     private List<Genero> generos;
    
    public ControllerGenero () {
        gDao = new GeneroDao();
        genero = new Genero();
        generos = new LinkedList<>();
    }
    
    public Genero getGenero () {
        return genero;
    }
    
    
    
    public void salvar() {
        gDao.salvar(genero);
    }
    
    public List<Genero> listarGeneros () {
        generos = new LinkedList<>();
        return generos = gDao.listar();
    }

    public List<Genero> getGeneros() {
        return generos;
    }
}
