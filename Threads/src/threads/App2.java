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
        Runnable worker = new Worker("worker1");
        Thread t = new Thread(worker);
        t.start();
        Thread.sleep(10 * 1000);
        t.interrupt();
    }

    private static class Worker implements Runnable {

        private final String name;

        public Worker(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                int i = 0;
                while (true) {
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println(i++ + " " + this.name);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("DONE! " + this.name);
        }
    }

}
