/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempi;

/**
 *
 * @author alfonso
 */
public class Computer implements Cloneable {

    private final String marca;

    private double prezzo;

    private Cpu cpu;

    public Computer() {
        this.marca = null;
    }

    
    public Computer(String marca, Cpu cpu) {
        this.marca = marca;
        this.cpu = cpu;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" + "marca=" + marca + ", prezzo=" + prezzo + ", cpu=" + cpu + '}';
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        Computer clone = (Computer) super.clone();
        clone.setCpu((Cpu) this.getCpu().clone());
        return clone;
    }

}
