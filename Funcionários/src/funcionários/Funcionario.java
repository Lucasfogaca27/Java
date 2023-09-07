/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionários;

import java.util.Scanner;

/**
 *
 * @author fluca
 */
public class Funcionario {
    private  String departamento;
    private String nome; 
    private String dataAd;
    private String rg;
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAd() {
        return dataAd;
    }

    public void setDataAd(String dataAd) {
        this.dataAd = dataAd;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public void recebeAumento(float valorAumento){
        salario = salario + valorAumento;
    }
    
    public float calculaGanhoAnual(){
        return salario*12;
        
    }
    
    
}
    
    