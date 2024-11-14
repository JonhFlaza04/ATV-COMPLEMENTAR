/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 

/**
 *
 * @author JoaoL
 */
public class Biblioteca {

   public static void main(String[] args) { 
        String url = "jdbc:mysql://localhost:3306/biblioteca_tb"; 
        String user = "root"; // Usuário padrão do MySQL 
        String password = ""; // Senha do MySQL (vazia por padrão no XAMPP) 
  
        try { 
            // Carregar o driver JDBC do MySQL 
            Class.forName("com.mysql.cj.jdbc.Driver");  
  
            // Estabelecer conexão 
            Connection conn = DriverManager.getConnection(url, user, password); 
            System.out.println("Conectado ao banco de dados!"); 
  
            // Exemplo: Inserir um dado na tabela 
            String sqlInsert = "INSERT INTO id_Cliente (Joaquim) VALUES (?)"; 
            PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert); 
            pstmtInsert.setString(1, "Joaquim"); 
            pstmtInsert.executeUpdate(); 
            System.out.println("Registro inserido com sucesso!"); 
  
            // Exemplo: Consultar dados da tabela 
            String sqlSelect = "SELECT * FROM id_Cliente"; 
            PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); 
            ResultSet rs = pstmtSelect.executeQuery(); 
  
            while (rs.next()) { 
                int id = rs.getInt("id_Cliente	"); 
                String nome = rs.getString("Joaquim"); 
                System.out.println("id_Cliente	: " + id + ", Nome: " + nome); 
            } 
  
            // Fechar conexão 
            conn.close(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
 }
}
}
