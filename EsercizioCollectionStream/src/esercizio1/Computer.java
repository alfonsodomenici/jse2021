/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author alfonso
 */
public class Computer implements Articolo{

    private final String marca;
    private final double prezzo;

    public Computer(String marca, double prezzo) {
        this.marca = marca;
        this.prezzo = prezzo;
    }
    
    
    @Override
    public String getNome() {
        return marca;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Computer{" + "marca=" + marca + ", prezzo=" + prezzo + '}';
    }
    
    
            
}
