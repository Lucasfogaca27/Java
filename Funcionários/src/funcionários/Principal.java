/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionários;

/**
 *
 * @author fluca
 */
public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Juvêncio Juvenal Clotildes da Silva Xavier");
        f.setDepartamento("Bombeiro");
        f.setSalario(10346);
        f.setDataAd("10/08/2023");
        f.setRg("6666666666");
        System.out.println("Nome: " +f.getNome());
        System.out.println("Departamento: " +f.getDepartamento());
        System.out.println("Salário: R$ " +f.getSalario());
        System.out.println("Data de Admissão: " +f.getDataAd());
        System.out.println("RG: "+ f.getRg());
        f.recebeAumento(80);
        System.out.println("Salário Atualizado: R$ "+ f.getSalario());
        System.out.println("Ganho Anual: R$ " +f.calculaGanhoAnual());
        
        Funcionario f2 = new Funcionario ();
            f2.setNome("Juvelina Clotilde Maria das Dores Silvestre");
        
    }  
}
