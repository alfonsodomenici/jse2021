/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author alfonso
 */
public class App {

    public static void main(String[] args) {

        Rubrica r = new Rubrica();

        Voce voce = new Voce(Voce.Tipologia.SPORT, "Rossi mario");

        r.addOld(voce, new Contatto(Contatto.Tipo.CASA, "012512345"));

        //r.addOld(null, new Contatto(Contatto.Tipo.CASA, "01241234"));
        //r.addOld(new Voce(Voce.Tipologia.SPORT, "Rossi mario"), null);
        //Set<Contatto> contatti = Stream.of(new Contatto(Contatto.Tipo.CASA, "012312345"), new Contatto(Contatto.Tipo.PERSONALE, "349111111")).collect(Collectors.toSet());
        
        r.addOld(voce, Stream.of(new Contatto(Contatto.Tipo.CASA, "012312345"), new Contatto(Contatto.Tipo.PERSONALE, "349111111")).collect(Collectors.toSet()));

        r.stampa();

        
        r.add(Voce.Tipologia.AMICIZIE, "Rossi Mario", Contatto.Tipo.PERSONALE, "123456789");
        
        r.add(Voce.Tipologia.AMICIZIE, "Bianchi Anna", Contatto.Tipo.PERSONALE, "888997766");
        
        r.add(Voce.Tipologia.AMICIZIE, "Rossi Mario", Contatto.Tipo.EMAIL, "mario.rossi@gmail.com");
        
        r.stampa();
        
        r.elimina(Voce.Tipologia.AMICIZIE, "Rossi Mario", Contatto.Tipo.EMAIL, "mario.rossi@gmail.com");
        
        r.stampa();
        
        r.add(Voce.Tipologia.AMICIZIE, "Rossi Mario", Contatto.Tipo.EMAIL, "mario.rossi@gmail.com");
        
        r.stampa();
        
        r.find(Contatto.Tipo.EMAIL, "mario.rossi@gmail.com").ifPresentOrElse(System.out::println,() -> System.out.println("non trovato"));

        r.stampa();
        
        System.out.println("--------------------------- iterator ...................");
        for (Map.Entry<Voce, Set<Contatto>> en : r) {
            Voce key = en.getKey();
            Set<Contatto> val = en.getValue();
            System.out.println(key);
            val.forEach(System.out::println);
        }
        
    }
}
