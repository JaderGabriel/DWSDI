/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRIPTOG;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Jader
 */
public class Criptografia {
    String senha;
    String Crip;
    private static MessageDigest md = null;

    /*public Criptografia(String senha){
        System.out.println(Criptografia.criptografar(senha));
      
    }*/
    public String getSenha(){
        return Crip;
    }
    public void setSenha(String senha){
        Crip = Criptografia.criptografar(senha);
        this.senha = Crip;
      //  System.out.println(Crip);
        
    }
   static {

        try {

            md = MessageDigest.getInstance("MD5");

        } catch (NoSuchAlgorithmException ex) {

            ex.printStackTrace();

        }

    }
   private static char[] hexCodes(byte[] text) {

        char[] hexOutput = new char[text.length * 2];

        String hexString;

 

        for (int i = 0; i < text.length; i++) {

            hexString = "00" + Integer.toHexString(text[i]);

            hexString.toUpperCase().getChars(hexString.length() - 2,

                                    hexString.length(), hexOutput, i * 2);

        }

        return hexOutput;

}
public static String criptografar(String pwd) {

        if (md != null) {

            return new String(hexCodes(md.digest(pwd.getBytes())));

        }

        return null;

    }



}
