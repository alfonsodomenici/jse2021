/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import esercizio1.Catalogo;

/**
 *
 * @author alfonso
 */
public class App {
    public static void main(String[] args) {
        Catalogo<Mobile> mobili = new Catalogo<>();
        
        mobili.aggiungiArticolo(new Mobile("divano", 1000, 50, 200, 50));
        mobili.aggiungiArticolo(new Mobile("letto", 1500, 60, 220, 220));
        mobili.aggiungiArticolo(new Mobile("cassettiera", 2000, 100, 100, 70));
        mobili.aggiungiArticolo(new Mobile("scrivania", 500, 70, 80, 70));
        
        ProvaMobile.scegliMobile(mobili, 1900, 65, 230, 230).stream().forEach(System.out::println);
    }
}
