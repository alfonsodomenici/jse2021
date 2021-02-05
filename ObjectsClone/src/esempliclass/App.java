/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempliclass;

import esempi.Computer;
import esempi.Cpu;
import java.util.Arrays;

/**
 *
 * @author alfonso
 */
public class App {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell",new Cpu(4, "Intel", 2000));
        
        Class<? extends Computer> clazz = computer.getClass();
        
        System.out.println(clazz.getName());
        
        System.out.println(clazz.getSimpleName());
        
        System.out.println(Arrays.toString(clazz.getDeclaredFields()));
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));
        
    }
}
