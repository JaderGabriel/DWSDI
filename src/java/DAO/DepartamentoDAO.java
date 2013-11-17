/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import JPA.Departamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jader
 */
public class DepartamentoDAO {
    EntityManager criarConexao = null;
    private EntityManager conexao(){
        EntityManagerFactory factory = null;
        
        try{
            factory = Persistence.createEntityManagerFactory("WebAlunoPU");
            criarConexao = factory.createEntityManager();
            //System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX"+criarConexao);
            return criarConexao;
            //System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX"+criarConexao);
        }catch(Exception e){
            System.err.println(e);
        }finally{
            //factory.close();
        }
     return criarConexao;   
    }
    public boolean salvar (Departamento dep){
        Departamento busca;
     EntityManager conectar = conexao();
     try{
       conectar.getTransaction().begin();
       busca = conectar.find(Departamento.class, dep.getIdDepartamento());
       if(busca == null){
           conectar.persist(dep);
           conectar.getTransaction().commit();
           return true;
       }
       System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX"+busca);
       
     }catch(Exception ex){
         System.err.println(ex);
     }finally{
         criarConexao.close();
     }
     return false;
     
    }
}
