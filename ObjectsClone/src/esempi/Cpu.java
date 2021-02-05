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
public class Cpu implements Cloneable{

    private final int core;
    private final String Marca;
    private int freq;

    public Cpu(int core, String Marca, int freq) {
        this.core = core;
        this.Marca = Marca;
        this.freq = freq;
    }

    public int getCore() {
        return core;
    }

    public String getMarca() {
        return Marca;
    }

    public int getFreq() {
        return freq;
    }
    
    public void boost(int freq){
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Cpu{" + "core=" + core + ", Marca=" + Marca + ", freq=" + freq + '}';
    }

    @Override
    public Cpu clone() throws CloneNotSupportedException {
        return (Cpu)super.clone(); 
    }
    
    
    
}
