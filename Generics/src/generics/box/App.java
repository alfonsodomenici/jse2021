/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.box;

/**
 *
 * @author alfonso
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Box<String> box = new Box();
        
        box.inserisci("ciao");
        
        System.out.println(box);
        
        String o = box.estrai();
        
        System.out.println(o.toUpperCase());
        
        
        Box<Computer> box1 = new Box<>();
        
        box1.inserisci(new Computer("DELL", 1024));
        
        System.out.println(box1);
        
        Computer computer = box1.estrai();
        
        
    }
    
}
