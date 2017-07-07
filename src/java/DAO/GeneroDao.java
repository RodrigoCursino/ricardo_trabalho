/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.LinkedList;
import java.util.List;
import modelos.Genero;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Rodrigo
 */
public class GeneroDao {
    private Genero genero; 
   
   public void salvar(Genero genero) {
       Session sessao = null;
       Transaction transacao = null;
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       sessao.save(genero);
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
   
   
   public List <Genero> listar () {
       Session sessao = null;
       Transaction transacao = null;
       
       List generoList = new LinkedList<>();
       
       try {
       sessao = HibernateUtil.getSessionFactory().openSession();
       transacao = sessao.beginTransaction();
       generoList = sessao.createQuery("select g from Genero g").list();
       transacao.commit();
       } catch (RuntimeException ex) {
           if(transacao != null){
                transacao.rollback();
            }
           throw ex;
       } finally {
           sessao.close();
       }
       return generoList;
   }
  
}
