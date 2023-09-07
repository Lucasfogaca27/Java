/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fluca
 */
public class EmoçoesFinais {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria();
        conta.setNomeProprietario("Felisbina Felisberta da Silveira Sousa");
        conta.setAgencia(6666);
        conta.setConta(123456);
        conta.setSaldo(39);
        System.out.println("Nome: " +conta.getNomeProprietario());
        System.out.println("Agencia: " +conta.getAgencia());
        System.out.println("Conta: " +conta.getConta());
        System.out.println("Saldo: " +conta.getSaldo());
        boolean saque = conta.sacar(1000);
        if(saque == false){
            System.out.println("Faltou dinheiro, sociedadew capitalista");
        }
        conta.depositar(11);
        System.out.println("Saldo: " +conta.consultarSaldo());
        conta.sacar(20);
        System.out.println("Saldo: " +conta.consultarSaldo());
    }
}
