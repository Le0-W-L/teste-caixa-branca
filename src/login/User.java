package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe responsável por gerenciar operações de login.
 * 
 * Esta classe estabelece conexão com um banco de dados MySQL e
 * realiza a verificação de credenciais de usuários.
 */
public class User {

    /**
     * Variável que armazena o nome do usuário autenticado.
     */
    public String nome = "";

    /**
     * Variável que armazena o resultado da verificação do usuário.
     * Retorna true se as credenciais forem válidas, caso contrário, false.
     */
    public boolean result = false;

    /**
     * Método responsável por conectar ao banco de dados MySQL.
     * 
     * @return Connection Retorna uma conexão com o banco de dados.
     * Se a conexão falhar, retorna null.
     */
    @SuppressWarnings("deprecation")
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carregar o driver do MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            
            // Conectar ao banco de dados utilizando a URL, usuário e senha
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } 
        catch (Exception e) {
            // Captura qualquer exceção que possa ocorrer durante a conexão
            // e retorna null se falhar
        }
        return conn;
    }

    /**
     * Método que verifica se o usuário e a senha fornecidos são válidos.
     * 
     * @param login O login do usuário.
     * @param senha A senha do usuário.
     * @return boolean Retorna true se o usuário for autenticado com sucesso,
     * caso contrário, retorna false.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";

        // Montar a instrução SQL para consulta no banco de dados
        sql += "select none from usuarios ";
        sql += "where login = " + " ' " + login + " ' ";
        sql += " and senha = " + " ' " + senha + " '; ";
        
        // Conectar ao banco de dados
        Connection conn = conectarBD();
        
        try {
            // Criar um Statement para executar a consulta
            Statement st = conn.createStatement();
            
            // Executar a consulta SQL
            ResultSet rs = st.executeQuery(sql);
            
            // Verificar se a consulta retornou resultados
            if (rs.next()) {
                // Usuário autenticado com sucesso
                result = true;
                
                // Armazenar o nome do usuário
                nome = rs.getString("nome");
            }
        } 
        catch (Exception e) {
            // Captura qualquer exceção durante a execução da consulta
        }
        
        // Retornar o resultado da autenticação
        return result;
    }
} 
// Fim da Classe