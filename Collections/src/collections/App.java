/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alfonso
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, List<Contatto>> agenda = new HashMap<>();
        
        List<Contatto> c1 = new ArrayList<>();
        c1.add(new Contatto(Contatto.Tipo.FISSO, "012512345"));
        c1.add(new Contatto(Contatto.Tipo.TELEGRAM, "mario.rossi@telegram"));
        agenda.put("mario rossi", c1);
        
        System.out.println(agenda);
        
        if(agenda.containsKey("mario rossi")){
            System.out.println(agenda.get("mario rossi"));
        }
    }

}

class Contatto {

    public static enum Tipo {
        CASA, LAVORO, CELLULARE, FISSO, SKYPE, TELEGRAM
    }
    
    private final Tipo tipo;
    
    private final String valore;

    public Contatto(Tipo tipo, String valore) {
        this.tipo = tipo;
        this.valore = valore;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getValore() {
        return valore;
    }

    @Override
    public String toString() {
        return "Contatto{" + "tipo=" + tipo + ", valore=" + valore + '}';
    }
    
    
}
