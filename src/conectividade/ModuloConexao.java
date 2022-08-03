/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectividade;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author walquiria
 */
public class ModuloConexao {
    
    public static Connection conector(){
        Connection conexao = null;
        
        String fonte = "jdbc:mysql://localhost/biblioteca_ete";
        String driver = "com.mysql.jdbc.Driver";
        String usuario = "root";
        String senha = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(fonte, usuario, senha);
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar o banco" + e.getMessage(),"Aviso",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    
}
    
}
