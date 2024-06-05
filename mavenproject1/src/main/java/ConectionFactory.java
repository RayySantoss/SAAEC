
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wkslocaluser
 */
public class ConectionFactory {private String usuario = "root";
     private String senha = "";
     private String host = "localhost";
     private String porta = "3306";
     private String timezone = "America/Sao_Paulo";
     private String bd = "SAAEC";
     
     public Connection obtemConexao(){
         try{
             String url = "jdbc:mysql://" + host + ":" + porta + "/" + bd  +"?serverTimezone=" + timezone;
             Connection conectar =  DriverManager.getConnection(url, usuario, senha);
             
             if(conectar != null){
                 System.out.println("Conexão estabelecida com sucesso");
             }
            return conectar; 
         }catch(SQLException e){
             System.out.println("Erro ao tentar estabelecer a conexão com o banco de dados");
             e.printStackTrace();
             return null;
         }
         
     }

    public static void main(String[] args) {
      ConectionFactory connectionFactory = new ConectionFactory();
      Connection connection = connectionFactory.obtemConexao();
      
       if(connection != null){
                 System.out.println("Coenexão testada e aprovada");
             }else{
           System.out.println("Falha na conexão");
       }
    }
}
    

