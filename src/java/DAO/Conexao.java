/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author barbara
 */
public class Conexao {
    private final String url = "jdbc:postgresql://localhost/futebol";
    private final String usuario = "postgres";
    private final String senha = "12345678";
    
    public Connection getConexao(){
        Connection result = null;
        try {
            //setando o driver do postgres para a conexão;
            Class.forName("org.postgresql.Driver");     
            result = DriverManager.getConnection(url, usuario, senha);
            
            return result;                  //retorna se deu certo a conexão com o banco de dados;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
}
