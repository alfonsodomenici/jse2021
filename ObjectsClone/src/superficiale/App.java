/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiale;

import profonda.*;

/**
 *
 * @author alfonso
 */
public class App {
    public static void main(String[] args) {
        
        Point punto = new Point(10, 10);
        
        System.out.println(punto);
        
        Point clone = (Point)punto.clone();
        
        System.out.println(clone);
    }
}
