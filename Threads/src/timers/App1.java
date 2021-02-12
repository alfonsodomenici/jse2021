/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author tss
 */
public class App1 {

    public static void main(String[] args) throws InterruptedException {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime schedule = now.plus(5, ChronoUnit.SECONDS);
        Timer t = new Timer();
        t.schedule(new Work(),
                Date.from(schedule.atZone(ZoneId.systemDefault())
                        .toInstant()));
        System.out.println(LocalDateTime.now());
        Thread.sleep(10000);
        t.cancel();
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
