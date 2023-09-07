/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisor;

import java.util.Scanner;

/**
 *
 * @author fluca
 */
public class Principal {
    public static void main(String[] args){
        Scanner aulaCurta = new Scanner(System.in);
        Televisor tv = new Televisor();
        tv.aumentaVolume();
        System.out.println("O volume é igual a " + tv.retornaVolume());
        System.out.println("Digite o novo valor do volume");
        tv.alteraVolume(aulaCurta.nextInt());
        tv.diminuiVolume();
        System.out.println("O volume é igual a " + tv.retornaVolume());
    }
}
