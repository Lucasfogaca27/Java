/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lampadaempolgante;

/**
 *
 * @author fluca
 */
public class Principal {
    public static void main(String[] args){
        Lampada l = new Lampada();
        System.out.println(l.observa());
        l.liga();
        System.out.println(l.observa());
        l.desliga();
        System.out.println(l.observa());
        l.interruptor();
        System.out.println(l.observa());
        l.interruptor();
        System.out.println(l.observa());
    }
}
