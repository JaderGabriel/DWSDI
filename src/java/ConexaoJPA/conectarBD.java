/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConexaoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jader
 */
public class conectarBD {
    
    EntityManager criarConexao = null;
    public EntityManager conexao(){
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
}
