/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempi;

import superficiale.Point;

/**
 *
 * @author alfonso
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point p1 = new Point(100, 200);

        System.out.println("p1: " + p1);

        Point p2 = p1;

        System.out.println("p2: " + p2);

        p1.move(500, 500);

        System.out.println("p1: " + p1);

        System.out.println("p2: " + p2);

        Computer c1 = new Computer("IBM", new Cpu(4, "Intel", 2500));

        Computer c2 = (Computer) c1.clone();

        System.out.println("----------- prima di modifiche a c1 -------------------");

        System.out.println("c1: " + c1);

        System.out.println("c2: " + c2);

        c1.setPrezzo(200);

        c1.getCpu().boost(3500);

        System.out.println("----------- dopo modifiche a prezzo e cpu di c1 -------------------");

        System.out.println("c1: " + c1);

        System.out.println("c2: " + c2);

    }

}
