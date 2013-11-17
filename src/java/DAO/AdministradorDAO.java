/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import ConexaoJPA.conectarBD;
import JPA.Administrador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jader
 */
public class AdministradorDAO {
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
 public Administrador login (Integer ID){
     Administrador busca;
     EntityManager conectar = conexao();
     try{
       conectar.getTransaction().begin();
       busca = conectar.find(Administrador.class, ID);
       System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX"+busca);
       return busca;
     }catch(Exception ex){
         System.err.println(ex);
     }finally{
         criarConexao.close();
     }
        return null;
     
 }
}
