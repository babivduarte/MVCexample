
package DAO;

import Modelo.Time;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author barbara
 */
public class TimeDAO {
    public List<Time> listar(){
        List<Time> lista = new ArrayList();
        
        //gerando um objeto para fazer a conexão com o db através da classe Conexao;
        Conexao conexao = new Conexao();            
        Connection conn = conexao.getConexao(); 
        
        String sql = "select * from times;";        //comando para o db;
        try {
            //criando um Statement que vai ser executado no pgAdmin;
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);
            
            while (res.next()){
                Time time = new Time();
                time.setId(res.getInt("id"));
                time.setNomeTime(res.getString("nome"));
                time.setCidadeTime(res.getString("cidade"));
                time.setEstadoTime(res.getString("estado"));
                time.setPaisTime(res.getString("pais"));
                lista.add(time);
            }
        } catch (SQLException ex) {
            System.err.println("Erro de conexão!!!");
        }
        
        return lista;
    }
    
    public Time buscar(String nome){
        Time time = new Time();
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();
        String sql = "select * from times where nome like '"+nome+"%';";
        try {
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sql);
            time.setId(res.getInt("id"));
            time.setNomeTime(res.getString("nome"));
            time.setCidadeTime(res.getString("cidade"));
            time.setEstadoTime(res.getString("estado"));
            time.setPaisTime(res.getString("pais"));
        } catch (SQLException ex) {
            System.err.println("Erro de conexão!!!");
        }
        
        return time;
    }
    
    public String incluir (Time time){
        String nome = time.getNomeTime();
        String id = time.getId().toString();
        String pais = time.getPaisTime();
        String estado = time.getEstadoTime();
        String cidade = time.getCidadeTime();
        
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();
        String sql = "Insert into times values ("+id+",'"+nome+"','"+cidade+"','"+estado+"','"+pais+"');";
        
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.err.println("Erro de conexão!!!");
            return "Erro ao gravar.";
        }
        
        return "Gravado com sucesso!";
    }
    
    public String alterar(Time time) {
        String nome = time.getNomeTime();
        String id = time.getId().toString();
        String pais = time.getPaisTime();
        String estado = time.getEstadoTime();
        String cidade = time.getCidadeTime();
        
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();
        String sql = "update times set nome='"+nome+"', cidade='"+cidade+"', estado='"+estado+"', pais='"+pais+"'"
                + "where id="+id+";";
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.err.println("Erro de conexão!!!");
            return "Erro ao alterar. comando: \n"+sql;
        }
        
        return "Alterado com sucesso!!";
    }
    
    public String deletar(String id){
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConexao();
        String sql = "delete from times where id="+id+";";
        
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            System.err.println("Erro de conexão!!!");
            return "Erro ao deletar. comando: \n"+sql;
        }
        
        return "Deletado com sucesso!!";
    }
}
