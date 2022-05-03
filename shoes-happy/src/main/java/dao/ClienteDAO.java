package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.ConexaoMySQL;
import model.Cliente;

public class ClienteDAO {

    public void create(Cliente cliente) {
        Connection connection = ConexaoMySQL.iniciarConexao();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("INSERT INTO cliente (nome, endereco, modalidade) VALUES (?,?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getModalidade());

            stmt.executeUpdate();

        } catch (SQLException e) { 
            e.printStackTrace();
        } finally {
            ConexaoMySQL.encerrarConexao(connection, stmt);
        }
    }

    public ArrayList<Cliente> read(){
        Connection connection = ConexaoMySQL.iniciarConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Cliente> listaclientes = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()){
                model.Cliente cliente = new model.Cliente();
                cliente.setMatricula(rs.getInt("matricula"));
                cliente.setNome(rs.getString("nome")); 
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setModalidade(rs.getString("modalidade"));
                listaclientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoMySQL.encerrarConexao(connection, stmt, rs);
        }
        return listaclientes;
    }

    public void update(Cliente cliente) {
        Connection connection = ConexaoMySQL.iniciarConexao();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE cliente SET nome = ?, endereco = ?, modalidade = ? WHERE matricula = ?"); 
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getModalidade());
            stmt.setInt(4, cliente.getMatricula());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoMySQL.encerrarConexao(connection, stmt);
        }
    }
    
    public void delete(Cliente cliente) {
        Connection connection = ConexaoMySQL.iniciarConexao();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM cliente WHERE matricula = ?");
            stmt.setInt(1, cliente.getMatricula());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoMySQL.encerrarConexao(connection, stmt);
        }
    }
    
    public Cliente selecionarCliente(Cliente cliente){
        Connection connection = ConexaoMySQL.iniciarConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Cliente> listaclientes = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente WHERE matricula = ?");
            stmt.setInt(1, cliente.getMatricula()); 
            rs = stmt.executeQuery();

            while (rs.next()){ 
                cliente.setNome(rs.getString("nome")); 
                cliente.setEndereco(rs.getString("endereco")); 
                cliente.setModalidade(rs.getString("modalidade"));
                listaclientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoMySQL.encerrarConexao(connection, stmt, rs);
        }
        return cliente;
    }
}
