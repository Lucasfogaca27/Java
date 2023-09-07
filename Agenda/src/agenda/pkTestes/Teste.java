/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkTestes;

import java.util.List;
import pkBanco.ContatoDAO;
import pkNegocio.Contato;

/**
 *
 * @author fluca
 */
public class Teste {
    public static void main(String[] args){
    ContatoDAO contatoDao = new ContatoDAO();
    Contato contato = new Contato("Empolgante","(54)9666-1666");
    contatoDao.cadastrarContato(contato);
    Contato contatoAtualizado = new Contato
    ("Empolgante e emocionante","(54)9666-1661");
    contatoDao.atualizarContato(contato, contatoAtualizado);
    List<Contato> registros = contatoDao.consultarContato
            ("nome","Empolgante e emocionante");
        if(!registros.isEmpty()){
            for (Contato contatoRetornado : registros) {
                System.out.println("Nome: " +contatoRetornado.getNome());
                System.out.println("Telefone: " +
                        contatoRetornado.getTelefone());
            }
        } else {
            System.out.println("Nenhum registro encontrado!");
        }
        
        contatoDao.deletarContato(contatoAtualizado);
        
        registros = contatoDao.consultarContato
                 ("nome","Empolgante e emocionante");
        if(!registros.isEmpty()){
            for (Contato contatoRetornado : registros) {
                System.out.println("Nome: " +contatoRetornado.getNome());
                System.out.println("Telefone: " +
                        contatoRetornado.getTelefone());
            }
        } else {
            System.out.println("Nenhum registro encontrado!");
        }
    }
}
