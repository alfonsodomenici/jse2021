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
public class App2 {

    public static void main(String[] args) throws InterruptedException {
        Runnable worker = new App2Worker("worker1");
        Thread t = new Thread(worker);
        t.start();
        Thread.sleep(10 * 1000);
        t.interrupt();
    }

}
