/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fluca
 */
public class ContaBancaria {
    public String nomeProprietario;
    public int agencia, conta;
    public float saldo;

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(float valor){
        saldo = saldo + valor;
    }
    
    public boolean sacar(float valor){
        if(valor <= saldo) {
            saldo = saldo - valor;
            return true;  
        } else {
            return false;
        }
    }
    public float consultarSaldo(){
        return getSaldo();
    }
}
