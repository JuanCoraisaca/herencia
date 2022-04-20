/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.poounidad2;

/**
 *
 * @author PC-16
 */
public class PrincipalHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var gatoMama = new Gato(7,4);
        gatoMama.setColor("plomo");
        gatoMama.setNombre("Mishi");
        gatoMama.setRaza("Mestizo");
        gatoMama.setYearNacimiento(2017);
        gatoMama.setPropietario("Juan");
        
        System.out.println(gatoMama.getNombre());
        System.out.println(gatoMama.calcularVidasRestantes());
        System.out.println(gatoMama.getPropietario());
        
        
        
    }
    
}
