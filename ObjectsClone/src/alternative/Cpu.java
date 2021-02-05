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
public class Cpu {

    private final int core;
    private final String marca;
    private int freq;

    public static Cpu newInstance(Cpu cpu){
        return new Cpu(cpu.core, cpu.marca, cpu.freq);
    }
    
    public Cpu(int core, String Marca, int freq) {
        this.core = core;
        this.marca = Marca;
        this.freq = freq;
    }

    public int getCore() {
        return core;
    }

    public String getMarca() {
        return marca;
    }

    public int getFreq() {
        return freq;
    }
    
    public void boost(int freq){
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Cpu{" + "core=" + core + ", Marca=" + marca + ", freq=" + freq + '}';
    }

    
    
    
}
