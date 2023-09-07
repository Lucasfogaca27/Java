/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkNegocio;

/**
 *
 * @author fluca
 */
public class Contato {
    
    private String nome,telefone;
    
    public String getNome(){
        return nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public Contato(){
        
    }
    
    public Contato(String nome,String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
}
