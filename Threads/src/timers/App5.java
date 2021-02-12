/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tss
 */
public class App5 {

    public static void main(String[] args) throws InterruptedException {
        
        Runnable work = () -> {
            System.out.println("do work... "+ LocalDateTime.now());
        };
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        //Fixed Rate
        executor.scheduleWithFixedDelay(work, 2, 1, TimeUnit.SECONDS);
        System.out.println(LocalDateTime.now());
        Thread.sleep(10000);
        executor.shutdown();
    }

    private static class Work extends TimerTask {

        @Override
        public void run() {
            System.out.println("do work... "
                    + LocalDateTime.ofInstant(Instant.ofEpochMilli(this.scheduledExecutionTime()),
                            ZoneId.systemDefault()));
        }

    }
}
