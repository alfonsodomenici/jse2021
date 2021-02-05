/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternative;

/**
 *
 * @author alfonso
 */
public class Disk {

    private final int size;

    public Disk(Disk d) {
        this(d.size);
    }

    public Disk(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Disk{" + "size=" + size + '}';
    }

}
