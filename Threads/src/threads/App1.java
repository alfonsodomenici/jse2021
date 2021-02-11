/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author alfonso
 */
public class App1 {

    public static void main(String[] args) {
        App1Worker t1 = new App1Worker("Worker1",10);
        App1Worker t2 = new App1Worker("Worker2",10);
        t1.start();
        t2.start();
        new App1Worker("worker3", 100).start();
    }

    
}
