/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadaempolgante;

/**
 *
 * @author fluca
 */
public class Lampada {
    private boolean ligada = false;
    
    public void liga (){
        ligada = true;
    } 
    
    public void desliga(){
        ligada = false;   
    }
    
    public String observa(){
        if(ligada == true){
            return "Ligada";
        } else {
            return "Desligada";
        } 
    }
    
    public void interruptor(){
        if(ligada == true){
            ligada = false;
        }else{
            ligada = true;
        }
    }
}


