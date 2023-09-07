/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fluca
 */
public class Principal {
    public static void main (String[] args){
        PessoaFisica objetoPessoa = new PessoaFisica();
        objetoPessoa.setNome("Tabajara Silveira Silva Santos");
        objetoPessoa.setCpf("666.333.999.11");
        objetoPessoa.setRg("1234567890");
        objetoPessoa.setIdade(66);
        objetoPessoa.setEndereco("Rua Al mossar, do bairro Sabo dms");
        objetoPessoa.setTelefone("Nome: " + objetoPessoa.getNome());
        System.out.println("Nome: " +objetoPessoa.getNome());
        System.out.println("CPF: " +objetoPessoa.getCpf());
        System.out.println("RG: " +objetoPessoa.getRg());
        System.out.println("IDADE: " +objetoPessoa.getIdade());
        System.out.println("ENDEREÇO: " +objetoPessoa.getEndereco());
        System.out.println("TELEFONE: " +objetoPessoa.getTelefone());
    }
}
