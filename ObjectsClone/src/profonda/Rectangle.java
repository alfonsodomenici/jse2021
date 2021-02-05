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
public class Rectangle implements Cloneable {

    private final int w, h;
    private Point origin;

    public Rectangle(int w, int h, Point origin) {
        this.w = w;
        this.h = h;
        this.origin = origin;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public Point getOrigin() {
        return (Point) origin.clone();
    }

    public void move(Point p) {
        origin.move(p.getX(), p.getY());
    }

    @Override
    public String toString() {
        return "Rettangolo{" + "w=" + w + ", h=" + h + ", origin=" + origin + '}';
    }

    
    @Override
    public Rectangle clone() {
        try {
            Rectangle r = (Rectangle) super.clone();
            r.origin = origin.clone();
            return r;
        } catch (CloneNotSupportedException ex) {
            return null;
        }

    }

}
