/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio6;

import esercizio1.Articolo;
import esercizio1.Computer;
import esercizio2.Mobile;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alfonso
 */
public class App {

    public static void main(String[] args) {

        List<Articolo> articoli = new ArrayList<>();

        articoli.add(new Computer("IBM", 1000));
        articoli.add(new Mobile("scrivania", 100, 50, 200, 70));

        for (Articolo articolo : articoli) {
            if (articolo instanceof Articolo) {
                System.out.println(articolo);
            }
        }

        List<? super Computer> soloComputer = articoli.stream().filter(articolo -> articolo.getClass() == Computer.class).collect(Collectors.toList());

        List<? super Mobile> soloMobile = articoli.stream().filter(articolo -> articolo instanceof Mobile).collect(Collectors.toList());

        System.out.println("--------------- sottoinsiemi per tipo ------------------");

        soloComputer.forEach(System.out::println);

        soloMobile.forEach(System.out::println);

    }
}
