/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import esercizio1.Articolo;
import esercizio1.Catalogo;
import esercizio1.Computer;

/**
 *
 * @author alfonso
 */
public class App {

    public static void main(String[] args) {
        Catalogo<Articolo> catalogo = new Catalogo<>();

        catalogo.aggiungiArticolo(new Mobile("divano", 1000, 50, 200, 50));
        catalogo.aggiungiArticolo(new Mobile("letto", 1500, 60, 220, 220));
        catalogo.aggiungiArticolo(new Mobile("cassettiera", 2000, 100, 100, 70));
        catalogo.aggiungiArticolo(new Mobile("scrivania", 500, 70, 80, 70));

        catalogo.aggiungiArticolo(new Computer("IBM", 1500));
        catalogo.aggiungiArticolo(new Computer("DELL", 2000));
        catalogo.aggiungiArticolo(new Computer("ASUS", 1300));
        catalogo.aggiungiArticolo(new Computer("APPLE", 2500));

        Catalogo<Mobile> mobili = catalogo.sottocatalogo(Mobile.class);
        
        Catalogo<Computer> computers = catalogo.sottocatalogo(Computer.class);
        
        System.out.println("--------------- solo mobili ---------------------");
        System.out.println(mobili);
        
        System.out.println("--------------- solo computer ---------------------");
        System.out.println(computers);
        
        System.out.println("--------------- tutti ---------------------");
        System.out.println(catalogo.sottocatalogo(Articolo.class));
        
        //ProvaMobile.scegliMobile(catalogo.sottocatalogo(Mobile.class), 1900, 65, 230, 230).stream().forEach(System.out::println);
    }
}
