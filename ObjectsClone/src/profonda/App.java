/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profonda;

import superficiale.Point;

/**
 *
 * @author alfonso
 */
public class App {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(50, 20, new Point(10, 10));

        System.out.println(r);

        Rectangle clone = (Rectangle) r.clone();

        System.out.println(clone);

        r.move(new Point(20, 20));

        System.out.println(r);
        System.out.println(clone);

    }
}
