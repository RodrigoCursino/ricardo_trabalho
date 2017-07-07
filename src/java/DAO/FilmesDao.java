/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.LinkedList;
import java.util.List;
import modelos.Filmes;
import modelos.Genero;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Rodrigo
 */
public class FilmesDao {
    
   private Filmes filme;
   private Genero genero;
   
   public void salvar(Filmes filme) {
       Session sessao = null;
       Transaction transacao = null;
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       sessao.save(filme);
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       
   }
   
   public void atualizar (Filmes filme) {
       Session sessao = null;
       Transaction transacao = null;
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       sessao.update(filme);
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       
   }
      public Genero buscarGeneroPorId (String id) {
       Session sessao = null;
       Transaction transacao = null;
       Genero g = null;
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       g = new Genero();
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       
       return  g;
   }
   
      public void buscarPorId (String id) {
       Session sessao = null;
       Transaction transacao = null;
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       sessao.byId(id);
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       
   }
   
   public void delete (Filmes filme) {
       Session sessao = null;
       Transaction transacao = null;
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       sessao.delete(filme);
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       
   }
   
   public List <Filmes> listar () {
       Session sessao = null;
       Transaction transacao = null;
       
       List filmesList = new LinkedList<>();
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       filmesList = sessao.createQuery("select i from Filmes i").list();
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       return filmesList;
   }
  
}
