/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisor;

/**
 *
 * @author fluca
 */
public class Televisor {
    private int volume;
    
    public Televisor(){
        volume = 0;
    }
    
    public void aumentaVolume() {
       if(volume < 40)
        volume++;
    }
    
    public void diminuiVolume(){
       if(volume > 0)
        volume--;
    }
    
    public void alteraVolume(int valor){
        if(valor >= 0 && valor <= 40){
            volume = valor;
        }
    }
    
    public int retornaVolume(){
        return volume;
    }
}
