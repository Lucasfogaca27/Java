/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pkNegocio.Contato;

/**
 *
 * @author fluca
 */
public class ContatoDAO {
    private String usuarioBanco = "postgres";
    private String senhaBanco = "senacrs"; 
    private String urlBanco = "jdbc:postgresql://localhost:5432/contato";
    
    private Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urlBanco,usuarioBanco,
                    senhaBanco);
        } catch (SQLException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        } 
        return connection;
    }
    
    public int cadastrarContato(Contato contato){
        int cadastrado = 0;
        try{
            Connection conexao = getConnection();
            if (conexao != null){
                PreparedStatement cadastrar = conexao.prepareStatement
                ("INSERT INTO contatos(nome,telefone) VALUES (?,?)");
                cadastrar.setString(1, contato.getNome());
                cadastrar.setString(2, contato.getTelefone());
                cadastrar.executeUpdate();
                cadastrado = 1;
                cadastrar.close();
                conexao.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return cadastrado;
    }
    
    public boolean deletarContato(Contato contato){
        boolean contatoDeletado = false;
        try{
            Connection conexao = getConnection();
            if(conexao != null){
                PreparedStatement deletar = conexao.prepareStatement
                ("DELETE FROM contatos WHERE nome='"+ contato.getNome()+
                  "'AND telefone='" + contato.getTelefone() + "'");
                contatoDeletado = deletar.executeUpdate() > 0;
                deletar.close();
                conexao.close();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return contatoDeletado;
    }
    public boolean atualizarContato(Contato contato,Contato contatoAtual){
        boolean contatoAtualizado = false;
        try{
            Connection conexao = getConnection();
            if(conexao != null){
                PreparedStatement atualizar = conexao.prepareStatement
                ("UPDATE contatos SET nome=?,telefone=? WHERE nome=? AND telefone=?");
                atualizar.setString(1,contato.getNome());
                atualizar.setString(2,contato.getTelefone());
                atualizar.setString(3,contatoAtual.getNome());
                atualizar.setString(4,contatoAtual.getTelefone());
                contatoAtualizado = atualizar.executeUpdate() > 0;
                atualizar.close();
                conexao.close();
            } 
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return contatoAtualizado;
    }
    
    public List<Contato> consultarContato(String campo, String dado){
        List<Contato> contatos = new ArrayList<>();
        try{
            Connection conexao = getConnection();
            if(conexao != null){
                PreparedStatement consultar = conexao.prepareStatement
                ("SELECT * FROM contatos WHERE " + campo + " LIKE '%" + dado + "%'");
                ResultSet rs = consultar.executeQuery();
                while (rs.next()){
                    String nome = rs.getString("nome");
                    String telefone = rs.getString("telefone");
                    contatos.add(new Contato(nome,telefone));
                }
                rs.close();
                consultar.close();
                conexao.close();
            
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return contatos;
    }

}


