/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author tss
 */
public class App2Worker implements Runnable {

    private final String name;

    public App2Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {
                Thread.sleep((long) (Math.random() * 100));
                System.out.println(i++ + " " + this.name);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("DONE! " + this.name);
    }

}
