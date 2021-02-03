/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.Iterator;

/**
 *
 * @author alfonso
 */
public class App {
    public static void main(String[] args) {
        Catalogo<Computer> catalogo = new Catalogo<>();
        
        catalogo.aggiungiArticolo(new Computer("IBM", 1500));
        catalogo.aggiungiArticolo(new Computer("DELL", 2000));
        catalogo.aggiungiArticolo(new Computer("ASUS", 1300));
        catalogo.aggiungiArticolo(new Computer("APPLE", 2500));
        
        System.out.println("------------------- Articoli sotto prezzo 2000------------------------");
        System.out.println(catalogo.getArticoliSottoPrezzo(2000));
        
        System.out.println("----------------------- Catalogo completo ----------------------------");
        
        System.out.println(catalogo);
        
        System.out.println("----------------------- Catalogo completo visitato forma esplicita----------------------------");
        Iterator<Computer> it = catalogo.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("----------------------- Catalogo completo visitato forma implicita----------------------------");
        for (Computer computer : catalogo) {
            System.out.println(computer);
        }

    }
}

class Computer implements Articolo{

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