
package controller;

import DAO.FilmesDao;
import DAO.GeneroDao;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import modelos.Filmes;
import modelos.Genero;

@ManagedBean
public class ControllerFilme {
    private Filmes filme;
    private FilmesDao fdao;
    private GeneroDao gdao;
    private Genero genero;
    private Integer idGenero;
    private List<Genero> generos;
    private List<Filmes> filmes;
    
 
    public ControllerFilme () {
        filme = new Filmes();
        genero = new Genero();
        fdao = new FilmesDao();
        gdao = new GeneroDao();
    }
    
    @PostConstruct
    public void listar () {
        listarFilmes();
        try {
            generos = new LinkedList<>();
            generos = gdao.listar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
    
    
    public void listarFilmes () {
        fdao = new FilmesDao();
        try {
           filmes = new LinkedList<>();
           filmes = fdao.listar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
    }
   
    public void salvar () {
        genero.setGeneroId(idGenero);
        filme.setGenero(genero);
        fdao.salvar(filme);
        listarFilmes();
    }

    public Filmes getFilme() {
        return filme;
    }
    
    public void setFilme(Filmes filme) {
        this.filme = filme;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    public List<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }
    
}
