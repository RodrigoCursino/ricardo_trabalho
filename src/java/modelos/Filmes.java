package modelos;
// Generated 28/06/2017 23:16:45 by Hibernate Tools 4.3.1



/**
 * Filmes generated by hbm2java
 */
public class Filmes  implements java.io.Serializable {


     private Integer filmeId;
     private Genero genero;
     private String nome;
     private Integer ano;
     private String capa;
     private String sinopse;

    public Filmes() {
    }

	
    public Filmes(Genero genero) {
        this.genero = genero;
    }
    public Filmes(Genero genero, String nome, Integer ano, String capa, String sinopse) {
       this.genero = genero;
       this.nome = nome;
       this.ano = ano;
       this.capa = capa;
       this.sinopse = sinopse;
    }
   
    public Integer getFilmeId() {
        return this.filmeId;
    }
    
    public void setFilmeId(Integer filmeId) {
        this.filmeId = filmeId;
    }
    public Genero getGenero() {
        return this.genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAno() {
        return this.ano;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getCapa() {
        return this.capa;
    }
    
    public void setCapa(String capa) {
        this.capa = capa;
    }
    public String getSinopse() {
        return this.sinopse;
    }
    
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }




}

