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
 * @author Aluno
 */
public class ConexaoDao {
    public static Connection AbrirConexao(){
    Connection con = null;
    Try{
    Class.forName("com.mysql.jdbc.Driver");
    String url = "";
    con= DriverManager.getConnection(url,"root","123");
    
    
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro de Conexao", "Video Locadora", JOptionPane.ERROR_MESSAGE);
            e.getMessage();
            }
    return con;
    }
public static void FecharConexao(Connection con){
try {
con.close(); 
} catch (Exception e){
System.out.println(e.getMessage());
}

}
}
