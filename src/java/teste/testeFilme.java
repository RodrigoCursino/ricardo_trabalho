/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import DAO.FilmesDao;
import DAO.GeneroDao;
import java.util.LinkedList;
import java.util.List;
import modelos.Filmes;
import modelos.Genero;

/**
 *
 * @author Rodrigo
 */
public class testeFilme {
    public static void main(String[] args) {
        GeneroDao gdao = new GeneroDao();
        FilmesDao fdao = new FilmesDao();
                
        Genero genero = new Genero();
        Filmes filme = new Filmes();
        List<Filmes> listFilmes = new LinkedList<>();
        List<Genero> listGeneros = new LinkedList<>();
        //listFilmes = fdao.listar();
        listGeneros = gdao.listar();
        for (Genero f : listGeneros) {
            System.out.println(f.getNome());
        }
    
       //genero.setNome("Comédia");
        
       //gdao.salvar(genero);
    } 
}
