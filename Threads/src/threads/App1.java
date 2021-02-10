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
        new Worker("Worker1").start();
        new Worker("Worker2").start();
    }

    private static class Worker extends Thread {

        public Worker(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
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
}
