/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alfonso
 */
public class Computer {

    private final String marca;

    private double prezzo;

    private final Cpu cpu;

    private List<Disk> disks = new ArrayList<>();

    public static Computer newInstance(Computer c) {
        Computer result = new Computer(c.marca, Cpu.newInstance(c.cpu));
        result.disks = c.disks.stream().map(d -> new Disk(d)).collect(Collectors.toList());
        return result;
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

    @Override
    public String toString() {
        return "Computer{" + "marca=" + marca + ", prezzo=" + prezzo + ", cpu=" + cpu + '}';
    }

}
