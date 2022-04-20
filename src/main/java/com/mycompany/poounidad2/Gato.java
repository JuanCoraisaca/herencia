/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poounidad2;

/**
 *
 * @author PC-16
 */
public class Gato extends AnimalDomestico{
    private int numeroVidas;
    private int numeroAccidentesFatales;

    public Gato(int numeroVidas, int numeroAcccidentesFatales) {
        this.numeroVidas = numeroVidas;
        this.numeroAccidentesFatales = numeroAcccidentesFatales;
    }
    
     public Gato(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }
     
     public int calcularVidasRestantes(){
        return this.numeroVidas-this.numeroAccidentesFatales;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getNumeroAcccidentesFatales() {
        return numeroAccidentesFatales;
    }

    public void setNumeroAcccidentesFatales(int numeroAcccidentesFatales) {
        this.numeroAccidentesFatales = numeroAcccidentesFatales;
    }
    
    
}
