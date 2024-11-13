package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    // Nó 01
    public Connection conectarBD() {
        Connection conn = null;
        try {
            //Nó 02
            Class.forName("com.mysql.Driver.Manager").newInstance();

            //Nó 03
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } 
        catch (Exception e) {
            //Nó 04
        }
        //Nó 05
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    //Nó 06
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";

        //Nó 07
        Connection conn = conectarBD();

        // INSTRUCAO SQL - Nó 08
        sql += "select none from usuarios ";
        sql += "where login = " + " ' " + login + " ' ";
        sql += " and senha = " + " ' " + senha + " '; ";
        try {
            //Nó 09
            Statement st = conn.createStatement();

            //Nó 10
            ResultSet rs = st.executeQuery(sql);

            //Nó 11
            if (rs.next()) {
                //Nó 12
                result = true;
                nome = rs.getString("nome");
            }
        } 
        catch (Exception e) {
            //Nó 13
        }
        //Nó 14
        return result;
    }
} // fim da class