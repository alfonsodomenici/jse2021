/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import static java.lang.Thread.sleep;

/**
 *
 * @author tss
 */
public class App1Worker extends Thread {

    private final int n;
    
    public App1Worker(String name, int n) {
        super(name);
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.n ; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("DONE! " + getName());
    }

}
